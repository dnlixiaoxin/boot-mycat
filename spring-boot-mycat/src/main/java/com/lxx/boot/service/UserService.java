package com.lxx.boot.service;

import com.lxx.boot.model.User;

import java.util.List;

public interface UserService {

	void add(User u);
	
	List<User> find();
	
}
