package com.lxx.boot.service.impl;

import com.lxx.boot.mapper.UsersMapper;
import com.lxx.boot.model.Users;
import com.lxx.boot.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper usersMapper;
	
	@Override
	public void add(Users u) {
        ExecutorService executor = Executors.newFixedThreadPool(8);
        usersMapper.add(u);
	}

	@Override
	public List<Users> find() {
		return usersMapper.find();
	}

	
	
	
	
}
