package br.com.codenation.challenge.jobsendemail.resource;

import br.com.codenation.challenge.jobsendemail.model.Users;
import br.com.codenation.challenge.jobsendemail.service.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UsersResource {

    @Autowired
    private UsersServiceImpl usersService;

    @GetMapping
    public List<Users> getUsers(){
        return usersService.getUsers();
    }

    @GetMapping("/inactive")
    public List<Users> getUsersInactive(){
        return usersService.getUsersActiveFalseAndSentFalse();
    }

    @PostMapping
    public void saveUsers(@RequestBody Users users){
        usersService.saveUsers(users);
    }
}
