package com.theironyard.charlotte;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by BUBBABAIRD on 5/9/17.
 */
@Controller
public class GameTrackerSpringController {
    // you can add Autowired to your fields, it will cause spring to populate this field when it
    // creates this controller.  This is a process called dependency injection.
    @Autowired
    GameRepository messages;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {
        // cast the results of findAll to a list.
        // find all by default returns an Iterable.
        List<Message> messageList = (List)messages.findAll();
        model.addAttribute("messages", messageList);
        return "home";
    }

    @RequestMapping(path = "/add-message", method = RequestMethod.POST)
    // these fields match up exactly with the form from the homepage.
    public String addMessage(String name, String platform, String messageText) {
        Message message = new Message(name, platform, messageText);
        messages.save(message);
        return "redirect:/";
    }
    @RequestMapping(path = "/delete-message", method = RequestMethod.POST)
    public String deleteMessage(int id) {
        messages.delete(id);
        return "redirect:/";
    }
}
