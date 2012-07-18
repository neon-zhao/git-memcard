package org.cn.com.sandpay.myApp.service.impl;



import org.cn.com.sandpay.myApp.dao.CardStoreDao;
import org.cn.com.sandpay.myApp.domain.CardStore;
import org.cn.com.sandpay.myApp.service.CardStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Hello world!
 *
 */
@Service("CardStoreServiceImpl")
@Transactional
public class CardStoreServiceImpl implements CardStoreService
{
	@Autowired private CardStoreDao cardStoreDao;

	@Override
	public void inStore(CardStore cs) {
		cardStoreDao.save(cs);
	}

	@Override
	public void outStore(CardStore cs) {
		cardStoreDao.save(cs);		
	}


}
