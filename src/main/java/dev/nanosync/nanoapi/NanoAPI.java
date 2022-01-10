package dev.nanosync.nanoapi;

import dev.nanosync.nanoapi.entity.NanoPlayer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class NanoAPI extends JavaPlugin {
    @Override
    public void onEnable() {
        new NanoPlayer(Bukkit.getPlayer("TheMartinfer22")).sendMessage("teste");
    }
}
