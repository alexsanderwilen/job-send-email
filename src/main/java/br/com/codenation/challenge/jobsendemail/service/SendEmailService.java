package br.com.codenation.challenge.jobsendemail.service;

import br.com.codenation.challenge.jobsendemail.model.Users;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SendEmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(Users users){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setText(users.toString());

        try {
            mailSender.send(message);
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }
    }
}
