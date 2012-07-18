package org.cn.com.sandpay.myApp.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public abstract class HibernateBaseDao<T> extends HibernateDaoSupport implements
		BaseDao<T> {
	protected Class<T> entityClass;

	public HibernateBaseDao() {
		entityClass = getEntityClass();
	}

	@Autowired
	public void initSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	public void save(T entity) {
		getHibernateTemplate().save(entity);
	}

	public void delete(T entity) {
		getHibernateTemplate().delete(entity);
	}

	@SuppressWarnings("unchecked")
	public List<T> find(T example) {
		return getHibernateTemplate().findByExample(example);
	}

	public T find(Serializable id) {
		return getHibernateTemplate().get(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return getHibernateTemplate().find(
				"from " + entityClass.getSimpleName());
	}

	@SuppressWarnings("unchecked")
	private Class<T> getEntityClass() {
		Type type = getClass().getGenericSuperclass();
		Class<T> result = null;
		if (type instanceof ParameterizedType) {
			ParameterizedType pType = (ParameterizedType) type;
			result = (Class<T>) pType.getActualTypeArguments()[0];
		}
		return result;
	}

}
