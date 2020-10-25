package com.udacity.jwdnd.controller.chat;

public class ChatMessage {
    private String username;
    private String messageText;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getUsername() {
        return username;
    }

    public String getMessageText() {
        return messageText;
    }
}
