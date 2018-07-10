package com.test.service.impl;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.dao.IUserDao;
import com.test.pojo.User;
import com.test.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDao userDao;

	@Override
	public List<User> findUser() {
		return userDao.findUser();
	}

	@Override
	public User findById(int id) {
		return userDao.findById(id);
	}

	@Override
	public int saveUser(User user) {
		return userDao.saveUser(user);
	}

}
