package com.example.investment.api.mypage.controller;

import com.example.investment.api.mypage.controller.exception.AlreadyTakenUserName;

import com.example.investment.api.mypage.entity.User;

import com.example.investment.api.mypage.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/find-username")
    public Optional<String> findUsernameByEmail(@RequestParam String email) {
        Optional<User> user = userService.findByEmail(email);
        return user.map(User::getUsername);
    }

    @PostMapping("/check-username")
    public boolean checkUsername(@RequestParam String username) {
        return userService.isUsernameTaken(username);
    }

    @PutMapping("/update-username/{id}")
    public void updateUsername(@PathVariable Long id, @RequestParam String newUsername) {
        if (!userService.isUsernameTaken(newUsername)) {
            userService.updateUsername(id, newUsername);
        } else {
            throw new AlreadyTakenUserName();
        }
    }

    @PostMapping("/reset-password")
    public void resetPassword(@RequestParam String email, @RequestParam String newPassword) {
        userService.resetPassword(email, newPassword);
    }

    @PostMapping("/check-nickname")
    public boolean checkNickname(@RequestParam String nickname) {
        return userService.isNicknameTaken(nickname);
    }
}
