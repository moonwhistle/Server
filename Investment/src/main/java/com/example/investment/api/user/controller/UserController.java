package com.example.investment.api.user.controller;

import com.example.investment.api.user.entity.Member;
import com.example.investment.api.user.service.MemberService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final MemberService memberService;

    public UserController(final MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/create")
    public Member createUser(@RequestBody Member member){
        return memberService.createUser(member);
    }
}
