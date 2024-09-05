package com.infosys.service;

import org.springframework.stereotype.Service;

import com.infosys.dto.ResponseDTO;
import com.infosys.entity.UserInfo;

@Service
public interface UserInfoService {

	public UserInfo saveUserInfo(UserInfo usrUserInfo);
	public ResponseDTO getUser(Long userid);
}
