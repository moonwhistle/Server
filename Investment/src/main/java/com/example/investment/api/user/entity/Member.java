package com.example.investment.api.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;

import jakarta.persistence.GenerationType;

@Entity
@Getter
public class Member {

    public Member() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String email;

    public Member(final Long id, final String name, final String password, final String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

}
