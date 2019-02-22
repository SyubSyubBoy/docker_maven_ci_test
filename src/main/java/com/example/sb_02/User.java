package com.example.sb_02;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(unique = true)
    private int id;

    @Column(length = 32, unique = true)
    private String username;

    private String password;

    public User(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }
}
