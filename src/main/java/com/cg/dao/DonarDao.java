package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.pojo.Donar;

@Repository
public interface DonarDao extends JpaRepository<Donar, Integer> {

	public List<Donar> findBydonarPhoneNo(String donarPhoneNo);

	@Modifying(clearAutomatically = true)
	@Query("update Donar d set d.status = :status where d.donarId =:donarId")
	public void updateDonarStatus(@Param("status") String status, @Param("donarId") int donarId);
}
