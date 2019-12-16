package br.com.codenation.challenge.jobsendemail.service;

import br.com.codenation.challenge.jobsendemail.model.Users;
import br.com.codenation.challenge.jobsendemail.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersServiceInterface{
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    @Override
    public List<Users> getUsersActiveFalseAndSentFalse() {
        return usersRepository.findUsersByActiveFalseAndSentFalse();
    }

    @Override
    public void saveUsers(Users users) {
        usersRepository.save(users);
    }
}
