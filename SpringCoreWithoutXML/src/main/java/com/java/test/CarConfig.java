package com.java.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.test.car.Car;
import com.test.car.Engine;

@Configuration
//@ComponentScan({"com.java.test", "com.test.car"})
@PropertySource("classpath:car-info.properties")
public class CarConfig {
	
//	three way of creating bean obj
//	1) xml approach
//	2) @Component Approach
//	3) @Bean Approach
	
	@Bean
	public Engine engineBean() {
		Engine engine = new Engine();
		return engine;
	}
	
	@Bean
	public Car carBean() {
		Car car = new Car(engineBean());
		return car;
	}
}
