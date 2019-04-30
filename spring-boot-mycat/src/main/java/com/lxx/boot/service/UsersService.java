package com.lxx.boot.service;

import com.lxx.boot.model.Users;

import java.util.List;

public interface UsersService {

	public void add(Users u);
	
	List<Users> find();
	
}
