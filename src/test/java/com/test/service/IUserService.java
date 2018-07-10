package com.test.service;

import java.util.List;
import com.test.pojo.User;


public interface IUserService {
	
	List<User> findUser();
	User findById(int id);
	int saveUser(User user);

}
