package dev.nanosync.nanoapi.event;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NanoInventoryEvent implements Listener {

    private static List<String> menusRegistered = new ArrayList<>();

    private static Map<String, Integer> menuSlot = new HashMap<>();
    private static Map<String, String> menuCommand = new HashMap<>();

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){
        menusRegistered.forEach(menu -> {
            if (event.getInventory().getType().getDefaultTitle().equals(menu) && menuCommand.containsKey(menu)){ // If menu is visual then not close
                menuSlot.forEach((menuN1, slot) -> {
                    if (event.getSlot() == slot && menuN1.equals(menu)) {
                        menuCommand.forEach((menuN2, command) -> {
                            if (menuN1.equals(menuN2)){
                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), command
                                        .replace("{player}", event.getWhoClicked().getName()));
                            }
                        });
                    }
                });
                // Close inventory on click an item if menu has commandMenu
                event.getWhoClicked().closeInventory();
            }
        });
    }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent event){
        menusRegistered.forEach(menu -> {
            if (event.getInventory().getType().getDefaultTitle().equals(menu)){
                event.setCancelled(true);
            }
        });
    }

    @EventHandler
    public void onInventoryInteract(InventoryInteractEvent event){
        menusRegistered.forEach(menu -> {
            if (event.getInventory().getType().getDefaultTitle().equals(menu)){
                event.setCancelled(true);
            }
        });
    }

    @EventHandler
    public void onInventoryPickup(InventoryPickupItemEvent event){
        menusRegistered.forEach(menu -> {
            if (event.getInventory().getType().getDefaultTitle().equals(menu)){
                event.setCancelled(true);
            }
        });
    }

    public static void addMenu(String menuName){
        if (menusRegistered.stream().anyMatch(m -> m.equals(menuName))) return;
        menusRegistered.add(menuName);
    }

    public static void addCommandMenu(int slot, String menuName, String command){
        if (menuCommand.containsKey(menuName)) return;
        if (menuSlot.containsKey(menuName)) return;
        menuSlot.put(menuName, slot);
        menuCommand.put(menuName, command);
    }
}
