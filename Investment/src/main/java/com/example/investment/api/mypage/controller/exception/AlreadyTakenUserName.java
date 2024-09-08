package com.example.investment.api.mypage.controller.exception;

public class AlreadyTakenUserName extends IllegalArgumentException{
    public AlreadyTakenUserName() {
        super("유저 이름이 이미 존재합니다.");
    }
}
