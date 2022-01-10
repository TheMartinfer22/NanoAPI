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

    public Message placeholder(String string, String target){
        message = message.replace(string, target);
        return this;
    }

    public String build(){
        return message;
    }
}
