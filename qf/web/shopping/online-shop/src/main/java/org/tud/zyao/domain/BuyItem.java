package org.tud.zyao.domain;

import java.io.Serializable;

public class BuyItem implements Serializable{
	private Goods goods;
	private int number;
	private double money;
	public BuyItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BuyItem(Goods goods, int number) {
		super();
		this.goods = goods;
		this.number = number;
	}
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getMoney() {
		//calculate
		money=goods.getPrice()*number;
		
		return money;
	}
	
	
	
	
}
