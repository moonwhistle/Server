package com.example.investment.user.service.dto;

import com.example.investment.user.entity.UserEntity;

public record UserRequest(String name, String password, String email) {

    public UserEntity toUserEntity(){
        return new UserEntity(null,name, password, email);
    }
}
