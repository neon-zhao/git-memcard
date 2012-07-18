package org.cn.com.sandpay.myApp.dao.impl;

import org.cn.com.sandpay.myApp.dao.HibernateBaseDao;
import org.cn.com.sandpay.myApp.dao.UserDao;
import org.cn.com.sandpay.myApp.domain.User;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public class UserDaoImpl extends HibernateBaseDao<User> implements UserDao{

}
