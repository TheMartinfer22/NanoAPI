package dev.nanosync.nanoapi.chat;

import org.junit.Assert;
import org.junit.Test;

public class MessageTest {

    private String messageString = "A &cTest for message";
    private Message message = new Message(messageString);

    @Test
    public void returnAColorMessage(){
        Assert.assertEquals("A §cTest for message", message.color().build());
    }

    @Test
    public void removeACharOrStringInMessage(){
        Assert.assertEquals("&cTest for message", message.remove("A ").build());
    }

    @Test
    public void canReplaceAStringInMessage(){
        Assert.assertEquals("A &cTest for string", message.placeholder("message", "string").build());
    }
}
