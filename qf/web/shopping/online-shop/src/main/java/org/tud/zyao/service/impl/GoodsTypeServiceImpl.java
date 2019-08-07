package org.tud.zyao.service.impl;

import java.util.List;

import org.tud.zyao.dao.GoodsTypeDao;
import org.tud.zyao.dao.impl.GoodsTypeDaoImpl;
import org.tud.zyao.domain.GoodsType;
import org.tud.zyao.service.GoodsTypeService;

public class GoodsTypeServiceImpl implements GoodsTypeService{

	private GoodsTypeDao goodsTypeDao=new GoodsTypeDaoImpl();
	@Override
	public List<GoodsType> finaAll() {
		// TODO Auto-generated method stub
		return goodsTypeDao.findAll();
	}
	
}
