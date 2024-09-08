package com.example.investment.api.user.service.dto;

import com.example.investment.api.user.entity.UserEntity;

public record UserRequest(String name, String password, String email) {

    public UserEntity toUserEntity(){
        return new UserEntity(null,name, password, email);
    }
}
