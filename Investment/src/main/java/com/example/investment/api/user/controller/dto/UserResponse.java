package com.example.investment.api.user.controller.dto;

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
