package com.infosys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableFeignClients
public class FeignClientOrdersApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientOrdersApplication.class, args);
	}

}
