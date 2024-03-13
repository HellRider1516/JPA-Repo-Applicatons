package com.mahesh;

import org.springframework.stereotype.Component;

@Component("Car")
public class Car implements ServiceProvider {
	
	public Car() {
		super();
		System.out.println("Car :: const");
	}

	@Override
	public boolean renter() {
		System.out.println("I go with the Car");
		return true;
	}

}
