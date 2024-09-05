package com.infosys.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customerdto {
	private Integer id;
	private String name;
	private Integer age;
	private Character genger;
	private String address;

}
