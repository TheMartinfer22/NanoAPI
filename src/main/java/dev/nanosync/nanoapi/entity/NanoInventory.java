package dev.nanosync.nanoapi.entity;

import dev.nanosync.nanoapi.event.NanoInventoryEvent;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class NanoInventory {
    private Inventory inventory;

    public NanoInventory(String owner, int size, String menuName){
        this.inventory = Bukkit.createInventory(Bukkit.getPlayer(owner), size, menuName);
        NanoInventoryEvent.addMenu(menuName);
    }

    public NanoInventory addItem(int index, ItemStack itemStack){
        inventory.setItem(index, itemStack);
        return this;
    }

    public NanoInventory addActionCommand(int index, String menuName, String command){
        NanoInventoryEvent.addCommandMenu(index, menuName, command);
        return this;
    }
}
