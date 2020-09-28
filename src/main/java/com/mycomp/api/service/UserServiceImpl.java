package com.mycomp.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycomp.api.model.User;
import com.mycomp.api.repository.PostgresDBAccessMapper;


@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	PostgresDBAccessMapper pgDBAccessMapper;
	
	@Override
	public List<User> fetchAllUsers() {
		
		return pgDBAccessMapper.getUsers();
	}

}
