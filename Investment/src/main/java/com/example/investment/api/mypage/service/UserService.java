package com.example.investment.api.mypage.service;

import com.example.investment.api.mypage.entity.User;
import com.example.investment.api.mypage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public boolean isUsernameTaken(String username) {
        return userRepository.findByUsername(username).isPresent();
    }

    public boolean isNicknameTaken(String nickname) {
        return userRepository.findByNickname(nickname).isPresent();
    }

    public void updateUsername(Long id, String newUsername) {
        Optional<User> user = userRepository.findById(id);
        user.ifPresent(u -> {
            u.setUsername(newUsername);
            userRepository.save(u);
        });
    }

    public void resetPassword(String email, String newPassword) {
        Optional<User> user = userRepository.findByEmail(email);
        user.ifPresent(u -> {
            u.setPassword(newPassword);
            userRepository.save(u);
        });
    }

}