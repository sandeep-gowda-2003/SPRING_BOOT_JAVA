package com.practice.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentResponse {
	private Integer id;
	private String name;
	private String course;
	private String address;
}
