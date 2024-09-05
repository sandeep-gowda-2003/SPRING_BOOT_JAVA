package com.infosys.service;

import com.infosys.entity.ResponseDto;
import com.infosys.entity.UserInfo;


public interface UserInfoService {
	UserInfo saveUser(UserInfo userinfo);
	ResponseDto getUser(Long userid);
}
