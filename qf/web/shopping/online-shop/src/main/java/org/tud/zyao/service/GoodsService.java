package org.tud.zyao.service;

import org.tud.zyao.domain.Goods;
import org.tud.zyao.domain.PageBean;

public interface GoodsService {
	PageBean<Goods> findByPage(int pageNum,int pageSize,int typeId);

	Goods findById(int id);
	
}
