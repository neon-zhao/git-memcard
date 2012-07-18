package org.cn.com.sandpay.myApp.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	void save(T entity);

	void delete(T entity);

	List<T> find(T example);

	T find(Serializable id);

	List<T> findAll();
}
