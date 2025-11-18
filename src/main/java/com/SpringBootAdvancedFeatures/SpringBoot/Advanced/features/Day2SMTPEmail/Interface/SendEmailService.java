package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day2SMTPEmail.Interface;

import com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day2SMTPEmail.EmailSender;

public interface SendEmailService {
    String sendSimpleMail(EmailSender details);
    String sendMailWithAttachment(EmailSender details);
}
