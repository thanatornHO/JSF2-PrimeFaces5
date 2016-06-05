package com.nd.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "user")
public class UserController {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
