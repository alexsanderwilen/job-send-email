package br.com.codenation.challenge.jobsendemail.repository;

import br.com.codenation.challenge.jobsendemail.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long> {

    List<Users> findUsersByActiveFalseAndSentFalse();
}
