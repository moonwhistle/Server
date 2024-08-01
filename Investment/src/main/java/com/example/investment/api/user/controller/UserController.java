package com.example.investment.api.user.controller;

import com.example.investment.api.user.entity.UserEntity;
import com.example.investment.api.user.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public UserEntity createUser(@RequestBody UserEntity userEntity){
        return userService.createUser(userEntity);
    }
}
