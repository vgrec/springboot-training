package com.udacity.jwdnd.controller.chat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chat")
public class ChatController {

    private ChatMessageService messageService;

    public ChatController(ChatMessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public String getChatView(@ModelAttribute("chatForm") ChatForm chatForm, Model model) {
        model.addAttribute("messages", messageService.getMessages());
        return "chat";
    }

    @PostMapping
    public String postMessage(@ModelAttribute("chatForm") ChatForm chatForm, Model model) {
        messageService.addMessage(chatForm);

        model.addAttribute("messages", messageService.getMessages());
        return "chat";
    }

    @ModelAttribute("allMessageTypes")
    public String[] allMessageTypes(){
        return new String[]{"Say", "Shout", "Whisper"};
    }

}
