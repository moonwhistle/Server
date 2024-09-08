package com.example.investment.api.user.service;

import com.example.investment.api.user.entity.UserEntity;
import com.example.investment.api.user.repository.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserEntity userEntity){
        return userRepository.save(userEntity);
    }

}
