package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.infosys.entity.DepartmentsDto;
import com.infosys.entity.ResponseDto;
import com.infosys.entity.UserInfo;
import com.infosys.entity.UserInfoDto;
import com.infosys.repository.UserInfoRepository;

@Service
public class UserInfoServiceImpl implements UserInfoService{
	@Autowired
	private RestTemplate resttemplate;
	
	@Autowired
	UserInfoRepository urepository;
	
	@Override
	public UserInfo saveUser(UserInfo userinfo) {
		return null;
	}

	@Override
	public ResponseDto getUser(Long userid) {
		ResponseDto responsedto=new ResponseDto();
		UserInfo user=urepository.findById(userid).get();
		UserInfoDto userdto = mapToUser(user);
		ResponseEntity<DepartmentsDto> responseEntity=resttemplate.getForEntity("http://localhost:8080/api/departments/"+user.getDepartmentId(),DepartmentsDto.class);
		DepartmentsDto departmentDto=responseEntity.getBody();
		responsedto.setUserinfodto(userdto);
		responsedto.setDepartmentsdto(departmentDto);
		return null;
	}
	private UserInfoDto mapToUser(UserInfo user) {
		UserInfoDto userdto=new UserInfoDto();
		userdto.setId(user.getId());
		userdto.setFirstName(user.getFirstName());
		userdto.setLastName(user.getLastName());
		userdto.setEmail(user.getEmail());
		
		return userdto;
	}
	
}
