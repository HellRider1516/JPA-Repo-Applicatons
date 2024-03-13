package com.example.demo.UserDao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("UserDao :: const");
	}

	public String findName(int id) {
		if(id==100) {
			return "liyaz";
		}else if(id==101){
			return "ilyaz";
		}else {
			return"Life";
		}
	}

}


