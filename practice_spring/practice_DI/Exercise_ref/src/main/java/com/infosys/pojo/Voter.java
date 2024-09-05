package com.infosys.pojo;

import lombok.Data;

@Data
public class Voter {
	private int voterId;
	private String voterName;
	private Constituency constituency;
	
}
