package com.example.sb_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserByName(String username) {
        User user = userRepository.findUserByUsername(username).orElse(null);
        return user;
    }

    public void createNewUser(String username, String password) {
        User user = new User(username, password);
        userRepository.save(user);
    }
}
