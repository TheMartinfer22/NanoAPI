package dev.nanosync.nanoapi;

import be.seeseemelk.mockbukkit.MockBukkit;
import be.seeseemelk.mockbukkit.ServerMock;

public class NanoAPITest {

    private static ServerMock server;

    public static void setup() {
        server = MockBukkit.mock();
        MockBukkit.load(NanoAPI.class);
        server.addPlayer("Dev");
        server.addPlayer("Martin");
    }

    public static void shutdown() {
        MockBukkit.unmock();
    }
}
