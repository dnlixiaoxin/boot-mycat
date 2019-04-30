package com.lxx.boot.service.impl;

import com.lxx.boot.mapper.UserMapper;
import com.lxx.boot.model.User;
import com.lxx.boot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("usersService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public void add(User u) {
        userMapper.add(u);
	}

	@Override
	public List<User> find() {
		return userMapper.find();
	}

	
	
	
	
}
