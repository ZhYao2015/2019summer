package org.tud.zyao.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class BuyCart implements Serializable{
	private Map<Integer,BuyItem> map;
	private double cartMoney=0;
	public BuyCart() {
		super();
		// TODO Auto-generated constructor stub
		map=new HashMap<>();
	}
	public Map<Integer, BuyItem> getMap() {
		return map;
	}

	public double getCartMoney() {
		return cartMoney;
	}
	
	public void addBuyItem(BuyItem item) {
		int id=item.getGoods().getId();
		if(map.containsKey(item.getGoods().getId())) {
			
			BuyItem oldBuyItem=map.get(id);
			oldBuyItem.setNumber(oldBuyItem.getNumber()+item.getNumber());
			//update
		}else {
			
			map.put(item.getGoods().getId(), item);
			//adding
		}
		cartMoney+=item.getMoney();
	}
	
	public void removeBuyItem(Integer id) {
		BuyItem buyItem=map.remove(id);
		cartMoney-=buyItem.getMoney();
	}
}
