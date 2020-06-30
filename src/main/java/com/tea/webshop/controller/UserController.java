package com.tea.webshop.controller;

import com.tea.webshop.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Tea") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Hamster") String lastName,
                        @RequestParam(value = "age", defaultValue = "30") int age){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        System.out.println("User firstName:" + user.getFirstName());
        return user;
    }
}
