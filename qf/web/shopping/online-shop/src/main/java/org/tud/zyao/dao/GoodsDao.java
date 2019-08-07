package org.tud.zyao.dao;

import java.util.List;

import org.tud.zyao.domain.Goods;

public interface GoodsDao {
	//List<Goods> findAll();
	List<Goods> findByPage(int pageNum,int pageSize,int typeId);
	
	long findCount(int typeId);
	
	List<Goods> findByName(String name);
	
	void add(Goods goods);
	void update(Goods goods);
	void delete(int id);

	Goods findById(int id);
}
