package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day2SMTPEmail.controller;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day2SMTPEmail.EmailSender;
import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day2SMTPEmail.Interface.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmailController {
    @Autowired
    private SendEmailService emailService;

    // Sending a simple Email
    @PostMapping("/sendMail")
    public String
    sendMail(@RequestBody EmailSender details)
    {
        String status
                = emailService.sendSimpleMail(details);

        return status;
    }

    // Sending email with attachment
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(
            @RequestBody EmailSender details)
    {
        String status
                = emailService.sendMailWithAttachment(details);

        return status;
    }
}
