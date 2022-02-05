package dev.nanosync.nanoapi.entity;

import dev.nanosync.nanoapi.NanoAPITest;
import org.bukkit.Bukkit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NanoPlayerTest {

    @Before
    public void load(){
        NanoAPITest.setup();
    }

    @After
    public void unload(){
        NanoAPITest.shutdown();
    }

    @Test
    public void canSendMessageToNanoPlayer(){
        NanoPlayer nanoPlayer = new NanoPlayer(Bukkit.getPlayer("Dev"));

        Assertions.assertDoesNotThrow(() -> nanoPlayer.sendMessage("Hello Dev"));
    }

    @Test
    public void nanoPlayerIsPlayer(){
        NanoPlayer nanoPlayer1 = new NanoPlayer(Bukkit.getPlayer("Dev"));
        NanoPlayer nanoPlayer2 = new NanoPlayer(Bukkit.getPlayer("Martin"));

        boolean b = nanoPlayer1.getPlayer().canSee(nanoPlayer2.getPlayer());
        Assert.assertTrue(b);
    }
}
