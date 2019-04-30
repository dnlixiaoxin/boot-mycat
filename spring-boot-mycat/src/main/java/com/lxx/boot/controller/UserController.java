package com.lxx.boot.controller;

import com.lxx.boot.model.User;
import com.lxx.boot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/user/add")
	public String add(String name) {
		User u = new User();
		u.setName(name).
                setDate(new Date());
		userService.add(u);
		return "插入成功";
	}
	
	@RequestMapping("/user/find")
	public List<User> find() {
		return userService.find();
	}
	
}
