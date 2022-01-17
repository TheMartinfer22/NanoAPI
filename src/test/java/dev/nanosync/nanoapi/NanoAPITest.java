package dev.nanosync.nanoapi;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import dev.nanosync.nanoapi.entity.NanoPlayer;
import org.bukkit.Bukkit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NanoAPITest {
    private ServerMock server;
    private NanoAPI plugin;

    @Before
    public void setUp() {
        server = MockBukkit.mock();
        plugin = MockBukkit.load(NanoAPI.class);
    }

    @After
    public void tearDown() {
        MockBukkit.unmock();
    }

    @Test
    public void result(){
        server.addPlayer("TesteDev");
        NanoPlayer nanoPlayer = new NanoPlayer(Bukkit.getPlayer("TesteDev"));
        nanoPlayer.sendMessage("Teste &c123");
    }
}
