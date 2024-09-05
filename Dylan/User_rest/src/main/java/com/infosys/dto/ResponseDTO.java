package com.infosys.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

	private UserInfoDTO userInfoDTO;
	private DepartmentsDTO departmentsDTO;
	
}
