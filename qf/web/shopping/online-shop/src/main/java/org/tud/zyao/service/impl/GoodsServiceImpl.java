package org.tud.zyao.service.impl;

import java.util.List;

import org.tud.zyao.dao.GoodsDao;
import org.tud.zyao.dao.impl.GoodsDaoImpl;
import org.tud.zyao.domain.Goods;
import org.tud.zyao.domain.PageBean;
import org.tud.zyao.service.GoodsService;

public class GoodsServiceImpl implements GoodsService{

	private GoodsDao goodsDao=new GoodsDaoImpl();
	
	@Override
	public PageBean<Goods> findByPage(int pageNum, int pageSize, int typeId) {
		// TODO Auto-generated method stub
		long totalCount=goodsDao.findCount(typeId);
		List<Goods> data=goodsDao.findByPage(pageNum, pageSize, typeId);
		PageBean<Goods> pageBean=new PageBean<Goods>(pageNum,pageSize,totalCount,data);
		
		
		return pageBean;
	}

	@Override
	public Goods findById(int id) {
		// TODO Auto-generated method stub
		return goodsDao.findById(id);
	}
	
}
