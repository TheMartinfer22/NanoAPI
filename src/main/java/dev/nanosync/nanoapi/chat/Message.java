package dev.nanosync.nanoapi.chat;

public class Message {
    private String message;

    public Message(String message){
        this.message = message;
    }

    public Message color(){
        message = message.replace("&", "§");
        return this;
    }

    public String build(){
        return message;
    }
}
