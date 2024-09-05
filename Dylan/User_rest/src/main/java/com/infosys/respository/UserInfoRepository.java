package com.infosys.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {

}
