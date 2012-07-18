package org.cn.com.sandpay.myApp.service.impl;

import java.util.List;

import org.cn.com.sandpay.myApp.dao.UserDao;
import org.cn.com.sandpay.myApp.domain.User;
import org.cn.com.sandpay.myApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Hello world!
 *
 */
@Service("UserServiceImpl")
@Transactional
public class UserServiceImpl implements UserService
{
	@Autowired private UserDao userDao;

	@Override
	public void Login(String userName,String password) {
		List<User> list = userDao.findAll();
		if(list.size()>0){
			User user = list.get(0);
			System.out.println(user.getUserName());
			System.out.println(user.getPassword());
		}
	}

	@Override
	public void save(String userName, String password) {
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		userDao.save(user);
	}

	@Override
	public List<User> queryAll() {
		return userDao.findAll();
	}
}
