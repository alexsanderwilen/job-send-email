package br.com.codenation.challenge.jobsendemail.job;

import br.com.codenation.challenge.jobsendemail.model.Users;
import br.com.codenation.challenge.jobsendemail.service.SendEmailService;
import br.com.codenation.challenge.jobsendemail.service.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SendEmailJob {

    @Autowired
    private UsersServiceImpl usersService;


    @Autowired
    private SendEmailService sendEmailService;


    @Scheduled(fixedRate = 60000)
    public void sendEmail(){
        List<Users> usersList = usersService.getUsersActiveFalseAndSentFalse();
        for ( Users user: usersList ) {
            user.setUri("http://localhost:8080/api/v1/users?activite=".concat(user.getToken()));
            usersService.saveUsers(user);
            try {
                sendEmailService.sendEmail(user);
                user.setSent(true);
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}