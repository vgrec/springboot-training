package com.udacity.jwdnd.controller.chat;

public class ChatForm {
    private String username;
    private String messageText;
    private String messageType;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getUsername() {
        return username;
    }

    public String getMessageText() {
        return messageText;
    }

    public String getMessageType() {
        return messageType;
    }
}
