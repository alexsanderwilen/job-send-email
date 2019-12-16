package br.com.codenation.challenge.jobsendemail.service;

import br.com.codenation.challenge.jobsendemail.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(Users users){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setText(users.toString());

        try {
            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
