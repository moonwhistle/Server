package com.example.investment.api.user.service.dto;

import com.example.investment.api.user.entity.Member;

public record MemberRequest(String name, String password, String email) {

    public Member toUserEntity(){
        return new Member(null,name, password, email);
    }
}
