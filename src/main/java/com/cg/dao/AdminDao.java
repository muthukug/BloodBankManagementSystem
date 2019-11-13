package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.pojo.AdminReg;

@Repository
public interface AdminDao extends JpaRepository<AdminReg, String> {

	@Query("SELECT admin FROM AdminReg admin WHERE admin.phoneNo=(:phoneNo)")
	AdminReg adminlogin(@Param("phoneNo") String phoneNo);

	@Modifying(clearAutomatically = true)
	@Query("update AdminReg a set a.password = :password where a.phoneNo =:phoneNo")
	public void updatePassword(@Param("password") String password, @Param("phoneNo") String phoneNo);
}
