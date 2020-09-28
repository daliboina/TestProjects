package com.mycomp.api.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mycomp.api.model.User;

@Mapper
public interface PostgresDBAccessMapper {

	public List<User> getUsers();
}
