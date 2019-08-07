package org.tud.zyao.dao;

import java.util.List;

import org.tud.zyao.domain.GoodsType;

public interface GoodsTypeDao {
	List<GoodsType> findAll();
	GoodsType findById(int id);
	
	void add(GoodsType type);
	void update(GoodsType type);
	void delete(int id);
}
