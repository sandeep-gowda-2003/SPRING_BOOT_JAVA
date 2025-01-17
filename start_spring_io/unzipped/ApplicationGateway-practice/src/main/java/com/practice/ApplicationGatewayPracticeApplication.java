package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationGatewayPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationGatewayPracticeApplication.class, args);
	}

}


//paste this for communicating without eureka
//cloud:
//  gateway:
//    routes:
//      - id: MicroService1-Student
//        uri: http://localhost:8081
//        predicates:
//          - Path= /student/**
//          
//      - id: MicroService2-Address
//        uri: http://localhost:8082
//        predicates:
//          - Path= /address/**

//eureka:
//  client:
//    register-with-eureka: true
//    fetch-registry: true
//    service-url:
//      defaultZone: http://localhost:9000/eureka/
//  instance:
//    prefer-ip-address: true