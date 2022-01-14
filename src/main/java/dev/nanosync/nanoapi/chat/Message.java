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

    public Message remove(String target){
        message = message.replace(target, "");
        return this;
    }

    public Message placeholder(String target, String replacement){
        message = message.replace(target, replacement);
        return this;
    }

    public String build(){
        return message;
    }
}
