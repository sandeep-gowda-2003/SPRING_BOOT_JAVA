package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplicationPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplicationPracticeApplication.class, args);
	}

}


//go to run configurations->vm argumentsand put 
//-Dserver.port=portnumber 
//to run more instances