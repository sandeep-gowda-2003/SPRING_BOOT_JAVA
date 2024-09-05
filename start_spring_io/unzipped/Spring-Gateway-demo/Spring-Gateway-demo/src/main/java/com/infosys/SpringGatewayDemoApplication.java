package com.infosys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringGatewayDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayDemoApplication.class, args);
	}
	
	@Bean
	public RouteLocator routerBuilder(RouteLocatorBuilder routeLocatorBuilder) {
		
		return routeLocatorBuilder.routes().route("Microservice1",r->r.path("/servlet1/**").uri("http://localhost:8081/")).route("Microservice2",r->r.path("/servlet2/**").uri("http://localhost:8080/")).build();
	}
}
