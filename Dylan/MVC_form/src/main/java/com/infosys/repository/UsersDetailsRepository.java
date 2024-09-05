package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.infosys.entity.Usersdetails;

import jakarta.transaction.Transactional;


public interface UsersDetailsRepository extends JpaRepository<Usersdetails, Integer> {

//	@Transactional
//	@Modifying(clearAutomatically = true)
//	@Query(name ="update usersdetails set passwd=?1 where userid=?2",nativeQuery = true)
//	public void updatePasswd(String passwd,Integer userid);
	

}
