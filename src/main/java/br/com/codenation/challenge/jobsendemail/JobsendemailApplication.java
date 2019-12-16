package br.com.codenation.challenge.jobsendemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class JobsendemailApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobsendemailApplication.class, args);
    }

}
