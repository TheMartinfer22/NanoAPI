package dev.nanosync.nanoapi.entity;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import dev.nanosync.nanoapi.NanoAPI;
import org.bukkit.Bukkit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NanoPlayerTest {

    private ServerMock server;
    private NanoAPI plugin;

    @Before
    public void setUp() {
        server = MockBukkit.mock();
        plugin = MockBukkit.load(NanoAPI.class);
        server.addPlayer("Dev");
        server.addPlayer("Martin");
    }

    @After
    public void tearDown() {
        MockBukkit.unmock();
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
