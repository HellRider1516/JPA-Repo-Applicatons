package com.mahesh;

import org.springframework.stereotype.Component;

@Component("Bike")
public class Bike implements ServiceProvider {

	public Bike() {
		super();
		System.out.println("bike :: const");
	}

	@Override
	public boolean renter() {
		System.out.println("I go with the bike");
		return true;
	}

}
