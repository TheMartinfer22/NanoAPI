package dev.nanosync.nanoapi;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;
import org.junit.After;
import org.junit.Before;

public class NanoAPITest {

    private static ServerMock server;

    public static void setUp() {
        server = MockBukkit.mock();
        MockBukkit.load(NanoAPI.class);
        server.addPlayer("Dev");
        server.addPlayer("Martin");
    }

    public static void tearDown() {
        MockBukkit.unmock();
    }



}
