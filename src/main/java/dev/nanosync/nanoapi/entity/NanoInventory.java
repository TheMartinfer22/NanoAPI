package dev.nanosync.nanoapi.entity;

import dev.nanosync.nanoapi.event.NanoInventoryEvent;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class NanoInventory {
    private Inventory inventory;

    /**
     * Construtor responsável por criar um inventário
     *
     * @param owner | Dono do menu, deixar com conclhetes se for o servidor.
     * @param size | Tamanho do menu, 9 ->
     * @param menuName | Nome do menu
     */
    public NanoInventory(String owner, final int size, String menuName){
        this.inventory = Bukkit.createInventory(Bukkit.getPlayer(owner), size, menuName);
        NanoInventoryEvent.addMenu(menuName);
    }

    /**
     * Responsável por adicionar itens no inventário.
     *
     * @param index | Posição do item para ser adicionado
     * @param itemStack | Item a ser adicionado
     * @return | Padrão Builder
     */
    public NanoInventory addItem(final int index, ItemStack itemStack){
        inventory.setItem(index, itemStack);
        return this;
    }

    /**
     * todo
     *
     * @param index | Posição do item para ser adicionado
     * @param menuName | Nome do menu a ser adicionado o comando.
     * @param command | Comando a ser dispachado quando a index for acionada.
     * @return | Padrão Builder
     */
    public NanoInventory addActionCommand(int index, String menuName, String command){
        NanoInventoryEvent.addCommandMenu(index, menuName, command);
        return this;
    }
}
