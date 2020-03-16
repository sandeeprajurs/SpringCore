package com.test.car;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("engine")
public class Engine {
	
	@Value("${engine.Name}")
	String name;

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println(name + " engine");
	}
}
