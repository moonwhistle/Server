package com.example.investment.api.user.repository;


import com.example.investment.api.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long>{

}
