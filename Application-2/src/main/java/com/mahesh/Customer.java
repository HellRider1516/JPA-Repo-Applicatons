package com.mahesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private ServiceProvider sp;
	public Customer() {
		super();
		System.out.println("customer :: const");
	}

	@Autowired
	@Qualifier("Car")
	public void setSp(ServiceProvider sp) {
		this.sp = sp;
	}
	public void m1() {
		boolean status = sp.renter();
		if(status) {
			System.out.println("Iam happy");
		}else {
			System.out.println("Iam not happy");
		}
	}
	

}
