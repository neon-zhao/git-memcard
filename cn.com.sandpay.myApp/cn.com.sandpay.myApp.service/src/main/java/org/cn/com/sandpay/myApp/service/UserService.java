package org.cn.com.sandpay.myApp.service;

import java.util.List;

import org.cn.com.sandpay.myApp.domain.User;

/**
 * 卡仓库
 *
 */
public interface UserService 
{
   public void Login(String userName,String password);
   public void save(String userName,String password);
   public List<User> queryAll();
}
