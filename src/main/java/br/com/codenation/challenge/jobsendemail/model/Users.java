package br.com.codenation.challenge.jobsendemail.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String token;

    private String name;

    private String email;

    private boolean active;

    private boolean sent;

    @Transient
    @JsonIgnore
    private String uri;

    @Override
    public String toString() {

        return " Olá! ".concat(name).concat("\n").concat("\n")
                .concat("Obrigado por se registrar em nossa central de erros").concat("\n")
                .concat("Segue suas informações de registro.").concat("\n").concat("\n")
                .concat("Name: ").concat(name).concat("\n")
                .concat("Email: ").concat(email).concat("\n")
                .concat("Password: ").concat("*********").concat("\n")
                .concat("Clique no link abaixo para confirmar sua conta e concluir seu registro.").concat("\n").concat("\n")
                .concat(uri);
    }
}
