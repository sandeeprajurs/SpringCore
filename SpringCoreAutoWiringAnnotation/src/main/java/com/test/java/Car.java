package com.test.java;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
	String name;
	Engine engine;
	
	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void display() {
		engine.display();
		System.out.println(name);
	}
}
