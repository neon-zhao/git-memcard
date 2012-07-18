package org.cn.com.sandpay.myApp.dao.impl;

import org.cn.com.sandpay.myApp.dao.CardStoreDao;
import org.cn.com.sandpay.myApp.dao.HibernateBaseDao;
import org.cn.com.sandpay.myApp.domain.CardStore;
import org.springframework.stereotype.Repository;

@Repository("cardStoreDao")
public class CardStoreDaoImpl extends HibernateBaseDao<CardStore> implements CardStoreDao{

}
