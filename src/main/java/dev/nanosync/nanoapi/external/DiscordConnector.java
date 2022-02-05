package dev.nanosync.nanoapi.external;

import dev.nanosync.nanoapi.NanoAPI;
import lombok.SneakyThrows;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class DiscordConnector {

    private final JDA jda;

    @SneakyThrows
    public DiscordConnector(){
        String token = NanoAPI.getInstance().getConfig().getString("DiscordToken");
        jda = JDABuilder.createDefault(token).build();
    }

    public NanoDiscord getNanoDiscord(){
        return new NanoDiscord(jda);
    }

    public boolean isEnabled(){
        return NanoAPI.getInstance().getConfig().getBoolean("DiscordEnabled");
    }

}
