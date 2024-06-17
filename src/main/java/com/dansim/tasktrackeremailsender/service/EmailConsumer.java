package com.dansim.tasktrackeremailsender.service;


import com.dansim.tasktrackeremailsender.dto.EmailDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailConsumer {
    private final EmailService emailService;

    @KafkaListener(topics = "emailTopic",groupId = "myGroupId")
    public void listen(EmailDTO email){
            emailService.sendEmail(
                    email.getRecipientAddress(),
                    email.getTitle(),
                    email.getText()
            );


    }

}
