package com.udacity.jwdnd.controller.chat;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChatMessageService {
    private List<ChatMessage> messages;

    @PostConstruct
    public void postConstruct() {
        messages = new ArrayList<>();
    }

    public void addMessage(ChatForm chatForm) {
        ChatMessage message = new ChatMessage();
        message.setUsername(chatForm.getUsername());
        switch (chatForm.getMessageType()) {
            case "Shout":
                message.setMessageText(chatForm.getMessageText().toUpperCase());
                break;
            case "Whisper":
                message.setMessageText(chatForm.getMessageText().toLowerCase());
                break;
            default:
                message.setMessageText(chatForm.getMessageText());
        }
        messages.add(message);
    }

    public List<ChatMessage> getMessages() {
        return new ArrayList<>(messages);
    }
}
