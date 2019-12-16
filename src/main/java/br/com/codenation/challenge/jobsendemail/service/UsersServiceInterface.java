package br.com.codenation.challenge.jobsendemail.service;

import br.com.codenation.challenge.jobsendemail.model.Users;

import java.util.List;

public interface UsersServiceInterface {

    List<Users> getUsers();
    List<Users> getUsersActiveFalseAndSentFalse();
    void saveUsers(Users users);
}
