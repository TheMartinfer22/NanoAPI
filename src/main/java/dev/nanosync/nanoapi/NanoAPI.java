package dev.nanosync.nanoapi;

import dev.nanosync.nanoapi.entity.NanoPlayer;
import dev.nanosync.nanoapi.external.DiscordConnector;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.JavaPluginLoader;

import java.io.File;

public final class NanoAPI extends JavaPlugin {

    @Override
    public void onEnable() {
    }

    public NanoAPI() {
        super();
    }

    protected NanoAPI(JavaPluginLoader loader, PluginDescriptionFile description, File dataFolder, File file) {
        super(loader, description, dataFolder, file);
    }

    public static NanoAPI getInstance(){
        return getPlugin(NanoAPI.class);
    }
}
