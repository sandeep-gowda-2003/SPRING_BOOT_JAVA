package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infosys.dto.DepartmentsDTO;
import com.infosys.dto.ResponseDTO;
import com.infosys.dto.UserInfoDTO;
import com.infosys.entity.UserInfo;
import com.infosys.respository.UserInfoRepository;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	RestTemplate restTemplate;
	@Autowired
	private UserInfoRepository userInfoRepository;

	@Override
	public UserInfo saveUserInfo(UserInfo usrUserInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseDTO getUser(Long userid) {
		// TODO Auto-generated method stub
		ResponseDTO responseDTO = new ResponseDTO();
		UserInfo userInfo = userInfoRepository.findById(userid).get();
		UserInfoDTO userInfoDTO = mapToUser(userInfo);
		ResponseEntity<DepartmentsDTO> responseEntity = restTemplate
				.getForEntity("http://localhost:8080/api/departments/"+userInfo.getDepartmentId(),DepartmentsDTO.class);
		DepartmentsDTO  departmentsDTO = responseEntity.getBody();
		responseDTO.setUserInfoDTO(userInfoDTO);
		responseDTO.setDepartmentsDTO(departmentsDTO);
		
		
		
		return responseDTO;
	}

	private UserInfoDTO mapToUser(UserInfo user) {
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		userInfoDTO.setId(user.getId());
		userInfoDTO.setDepartmentId(user.getDepartmentId());
		userInfoDTO.setEmail(user.getEmail());
		userInfoDTO.setLastname(user.getLastname());
		userInfoDTO.setFirstname(user.getFirstname());
		
		return userInfoDTO;
	}
}
