package org.tud.zyao.dao;

import java.util.List;

import org.tud.zyao.domain.BuyItem;

public interface BuyCartDao{
	List<BuyItem> findById(int userId);
	void add(int userId,BuyItem buyItem);
	void update(int userId,BuyItem buyItem);
	void delete(int userId,int gId);
}
