package com.ssafy.hw.model.dao;

import java.util.List;

import com.ssafy.hw.model.dto.User;

public interface UserDao {

	int insert(User user);

	User searchById(String id);

	List<User> selectAll();

	List<User> searchByName(String name);
}