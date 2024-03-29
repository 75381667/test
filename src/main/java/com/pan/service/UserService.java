package com.pan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pan.Mapper.UserMapper;
import com.pan.model.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public List<User> findAll() {
		return userMapper.findAll();
	}

}
