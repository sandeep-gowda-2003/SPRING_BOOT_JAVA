package com.infosys.AnnotationComponent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.infosys.AnnotationComponent")
public class ShoppingListConfig {

	@Bean
	public Mobile iphone() {
		Mobile d1 = new Mobile();
		d1.setName("iphone");
		d1.setPrice(80000);
		d1.setBatteryCapacity(400);
		return d1;
	}
	@Bean
	public Mobile mi() {
		Mobile d2 = new Mobile();
		d2.setName("MI");
		d2.setPrice(40000);
		d2.setBatteryCapacity(500);
		return d2;
	}
	@Bean
	public Mobile vivo() {
		Mobile d3 = new Mobile();
		d3.setName("vivo");
		d3.setPrice(3000);
		d3.setBatteryCapacity(450);
		return d3;
	}
}
