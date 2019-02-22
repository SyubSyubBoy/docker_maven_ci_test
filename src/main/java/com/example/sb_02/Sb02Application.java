package com.example.sb_02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sb02Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb02Application.class, args);
    }

    @RequestMapping("/")
    public String getEnv() {
        String res = System.getenv("EXAM");
        return res != null ? res : "wow4";
    }
}
