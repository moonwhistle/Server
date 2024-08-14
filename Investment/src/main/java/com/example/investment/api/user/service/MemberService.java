package com.example.investment.api.user.service;

import com.example.investment.api.user.entity.Member;
import com.example.investment.api.user.repository.MemberRepository;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(final MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member createUser(Member member){
        return memberRepository.save(member);
    }

}
