package dev.nanosync.nanoapi.chat;

import org.junit.Assert;
import org.junit.Test;

public class MessageTest {

    @Test
    public void returnAColorMessage(){
        String messageString = "Test &3Color";
        Message message = new Message(messageString);

        Assert.assertEquals("Test §3Color", message.color().build());
    }

    @Test
    public void removeACharOrStringInMessage(){
        String messageString = "Test remove string";
        Message message = new Message(messageString);

        Assert.assertEquals("Test string", message.remove("remove ").build());
    }

    @Test
    public void canReplaceAStringInMessage(){
        String messageString = "Test replace string";
        Message message = new Message(messageString);

        Assert.assertEquals("Test replace message", message.placeholder("string", "message").build());
    }
}
