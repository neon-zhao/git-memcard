package org.cn.com.sandpay.myApp.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cardstore")
public class CardStore implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7112235279101255083L;
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Long rid;
	private Integer cardNum;
	public Long getRid() {
		return rid;
	}
	public void setRid(Long rid) {
		this.rid = rid;
	}
	public Integer getCardNum() {
		return cardNum;
	}
	public void setCardNum(Integer cardNum) {
		this.cardNum = cardNum;
	}
}
