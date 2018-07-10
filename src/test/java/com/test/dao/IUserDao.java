package com.test.dao;


import java.util.List;

import com.test.pojo.User;


public interface IUserDao {
	
	List<User> findUser();
	User findById(int id);
	User findByName(String username);
	int saveUser(User user);
	
}
