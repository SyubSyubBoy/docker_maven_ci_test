package com.example.sb_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
        return userService.getUserByName(username);
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public void createUser(@RequestBody RequestNewUser newUser) {
        userService.createNewUser(newUser.getUsername(), newUser.getPassword());
    }
}
