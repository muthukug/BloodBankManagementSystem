package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.pojo.UserReg;

@Repository
public interface UserLoginDao extends JpaRepository<UserReg, Integer> {

	@Query("SELECT DISTINCT(s.location) FROM UserReg s")
	List<String> getLocation();

	@Query("SELECT DISTINCT(n.name) FROM UserReg n")
	List<String> findName();

	@Query("SELECT DISTINCT(name) FROM UserReg reg where reg.phoneNo =  :pphoneNo")
	public List<String> getName(@Param("pphoneNo") String pphoneNo);

	@Query("SELECT DISTINCT(name) FROM UserReg reg where reg.location =  :location")
	public List<String> findByLocation(@Param("location") String location);

	@Query("SELECT DISTINCT(phoneNo) FROM UserReg reg where reg.name =  :name")
	public List<String> findByName(@Param("name") String name);

	@Query("SELECT DISTINCT(location) FROM UserReg reg where reg.bloodGroup =  :bloodGroup")
	public List<String> findByBloodGroup(@Param("bloodGroup") String bloodGroup);

	@Modifying(clearAutomatically = true)
	@Query("update UserReg a set a.password = :password where a.phoneNo =:phoneNo")
	public void updateUserPassword(@Param("password") String password, @Param("phoneNo") String phoneNo);

}
