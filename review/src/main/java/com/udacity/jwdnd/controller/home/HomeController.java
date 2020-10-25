package com.udacity.jwdnd.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    private boolean firstVisit = true;
    private MessageListService messageListService;

    public HomeController(MessageListService messageListService) {
        this.messageListService = messageListService;
    }

    /**
     * For the GET request handling method, we declare the MessageForm argument to ensure
     * that the object exists and is added to the model by Spring automatically.
     * This is necessary, because Thymeleaf needs an object with the name newMessage
     * to be present in the model to render properly, even if there isn't any data in the object yet.
     */
    @GetMapping("/home")
    public String getHomePage(@ModelAttribute("newMessage") MessageForm newMessage, Model model) {
        model.addAttribute("greetings", messageListService.getMessges());

        return "home";
    }

    /**
     * For the POST request handling method, we declare the MessageForm argument to tell
     * Spring that it should look for data that matches that in the body of the request we're
     * handling. Spring will then automatically extract that data and put it in a MessageForm
     * object before calling our method, passing it to us so we can use the data as we see fit.
     * <p>
     * In both cases, we're annotating this argument with @ModelAttribute.
     * This allows us to specify that Spring should add the object to our Model
     * before asking Thymeleaf to render the template.
     * That means we don't have to add it manually! Pretty handy.
     */
    @PostMapping("/home")
    public String addMessage(@ModelAttribute("newMessage") MessageForm newMessage, Model model) {
        messageListService.addMessage(newMessage.getText());
        model.addAttribute("greetings", messageListService.getMessges());
        newMessage.setText("");

        return "home";
    }


}
