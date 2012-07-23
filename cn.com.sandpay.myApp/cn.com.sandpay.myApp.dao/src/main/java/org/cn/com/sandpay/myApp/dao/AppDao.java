package org.cn.com.sandpay.myApp.dao;

import org.cn.com.sandpay.myApp.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Hello world!
 *
 */
@Repository
public interface AppDao extends CrudRepository<Long, User>
{
  
}
