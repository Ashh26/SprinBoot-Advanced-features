package com.SpringBootAdvancedFeatures.SpringBoot.Advanced.features.Day2SMTPEmail;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailSender {
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachments;


    public String getAttachment() {
        return "";
    }
}
