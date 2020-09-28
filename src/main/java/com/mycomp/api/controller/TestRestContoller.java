package com.mycomp.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.api.model.User;
import com.mycomp.api.service.IUserService;

@RestController
@RequestMapping("/api")
public class TestRestContoller {
	
	@Autowired
	IUserService userService;
	
	@RequestMapping(value = "/getUsers",method = RequestMethod.GET)
	public List<User> getAllUsers(){		
		return userService.fetchAllUsers();
	}	
}
