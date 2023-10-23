package com.g00dhabitz.SpringMailDemo.Controller;

import com.g00dhabitz.SpringMailDemo.Entity.Email;
import com.g00dhabitz.SpringMailDemo.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmailSenderController {
    @Autowired
    private EmailSenderService senderService;

    @GetMapping("/contact")
    public String contact(Model model) {
        Email email = new Email();
        model.addAttribute("email", email);
        return "contact";
    }
    @PostMapping("/contact")
    public String sendEmail(@ModelAttribute Email email) {
        senderService.sendEmail(email.getEmail(), "szachromtom@gmail.com", email.getSubject(), email.getText());
        senderService.sendEmail("szachromtom@gmail.com",email.getEmail(), email.getSubject(), email.getText());
        return "redirect:/contact";
    }

}
