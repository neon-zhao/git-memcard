package org.cn.com.sandpay.myApp.service;

import org.cn.com.sandpay.myApp.domain.CardStore;

public interface CardStoreService {

	public void inStore(CardStore cs);
	public void outStore(CardStore cs);
}
