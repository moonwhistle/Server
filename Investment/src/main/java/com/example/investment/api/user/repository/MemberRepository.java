package com.example.investment.api.user.repository;


import com.example.investment.api.user.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository <Member, Long>{

}
