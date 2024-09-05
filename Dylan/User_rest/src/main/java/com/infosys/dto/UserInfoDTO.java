package com.infosys.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDTO {

	private Long id;
	private String firstname;
	private String lastname;
	private String email;
	private String departmentId;

}