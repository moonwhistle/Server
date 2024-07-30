package com.example.investment.user.entity;

import com.example.investment.user.domain.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;


@Entity
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String email;

    public UserEntity(final Long id, final String name, final String password, final String email) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public UserEntity() {

    }

}
