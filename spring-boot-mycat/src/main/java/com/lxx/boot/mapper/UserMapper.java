package com.lxx.boot.mapper;

import com.lxx.boot.model.User;

import java.util.List;

public interface UserMapper {

	void add(User u);
	
	List<User> find();
	
}
