package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.pojo.UserReg;

@Repository
public interface UserRegDao extends JpaRepository<UserReg, String> {

}
