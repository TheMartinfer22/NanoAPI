package dev.nanosync.nanoapi.entity;

import dev.nanosync.nanoapi.chat.Message;

public class NanoPlayer {
    private org.bukkit.entity.Player player;

    public NanoPlayer(org.bukkit.entity.Player player){
        if (player == null) throw new NullPointerException("Player not found");
        this.player = player;
    }

    /**
     * Envia uma mensagem ao jogador com foratação compatível com cores.
     *
     * @param msg Mensagem que será formatada.
     */
    public void sendMessage(String msg){
        player.sendMessage(new Message(msg).color().build());
    }
}
