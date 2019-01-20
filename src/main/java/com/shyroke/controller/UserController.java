package com.shyroke.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shyroke.bean.User;
import com.shyroke.mapper.UserMapper;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	private UserMapper userMapper;
	
	@ResponseBody
	@RequestMapping(value="/get")
	public User get() {
		return userMapper.getOne(1);
	}
	
	@ResponseBody
	@RequestMapping(value="/list")
	public List<User> list() {
		return userMapper.list();
	}
	
	
}
