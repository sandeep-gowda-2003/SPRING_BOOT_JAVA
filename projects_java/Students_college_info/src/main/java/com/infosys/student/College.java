package com.infosys.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class College {
	private String cname;
	private String city;
	private Student student;
}
