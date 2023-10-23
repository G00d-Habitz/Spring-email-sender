package com.g00dhabitz.SpringMailDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;


    public void sendEmail(String sendTo, String replyTo, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("Szachromtom@gmail.com");
        message.setTo(sendTo);
        message.setReplyTo(replyTo);
        message.setSubject(subject);
        message.setText(text);

        mailSender.send(message);
    }
}
