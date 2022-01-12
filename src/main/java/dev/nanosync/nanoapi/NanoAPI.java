package dev.nanosync.nanoapi;

import dev.nanosync.nanoapi.entity.NanoPlayer;
import dev.nanosync.nanoapi.external.DiscordConnector;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class NanoAPI extends JavaPlugin {
    @Override
    public void onEnable() {
        // NanoPlayer Examples
        Player player = Bukkit.getPlayer("TheMartinfer22");
        new NanoPlayer(player).sendMessage("teste");

        // Discord Examples
        DiscordConnector discord = new DiscordConnector("token", "121212");
        discord.getGuild().getTextChannelById("1212").sendMessage("teste").queue();
    }
}
