package com.lxx.boot.mapper;

import com.lxx.boot.model.Users;

import java.util.List;

public interface UsersMapper {

	
	void add(Users u);
	
	List<Users> find();
	
}
