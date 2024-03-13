package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.UserDao.*;
@Component
public class Service {
	private UserDao userDao;
	int id;

	public Service(int id) {
		super();
		this.id = id;
	}
	public Service() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("service :: const");
	}
	@Autowired
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public int name(int id) {
		String name = userDao.findName(id);
		System.out.println("Name :: "+name);
		return id;
	}

}
