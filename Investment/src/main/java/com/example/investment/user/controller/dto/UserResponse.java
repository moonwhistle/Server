package com.example.investment.user.controller.dto;

import com.example.investment.user.service.dto.UserRequest;

public class UserResponse {

    private final Long id;
    private final String name;
    private final String password;
    private final String email;

    public UserResponse(final Long id, final String name, final String password, final String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

}
