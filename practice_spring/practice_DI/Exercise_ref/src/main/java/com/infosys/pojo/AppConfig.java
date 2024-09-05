package com.infosys.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Constituency constituency() {
		Constituency c=new Constituency();
		c.setConstituencyName("Karnataka");
		return c;
	}
	
	@Bean
	public Voter voter() {
		Voter v=new Voter();
		v.setVoterId(13);
		v.setConstituency(constituency());
		v.setVoterName("sanjay");
		return v;
	}
	
}
