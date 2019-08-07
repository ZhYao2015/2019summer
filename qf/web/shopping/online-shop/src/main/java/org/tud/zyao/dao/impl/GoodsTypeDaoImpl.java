package org.tud.zyao.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.tud.zyao.dao.GoodsTypeDao;
import org.tud.zyao.domain.GoodsType;
import org.tud.zyao.utils.DruidUtils;

public class GoodsTypeDaoImpl implements GoodsTypeDao{

	QueryRunner qr=new QueryRunner(DruidUtils.getDataSource());
	
	@Override
	public List<GoodsType> findAll() {
		// TODO Auto-generated method stub
		List<GoodsType> goodsType=null;
		
		try {
			goodsType=qr.query("select * from tb_goods_type", new BeanListHandler<>(GoodsType.class));
			return goodsType;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("GoodsTypeDaoImpl: goodsType querying error...");
		}
		
		
	}

	@Override
	public GoodsType findById(int id) {
		// TODO Auto-generated method stub
		GoodsType goodsType=null;
		try {
			goodsType=qr.query("select * from tb_goods_type where id=?", new BeanHandler<>(GoodsType.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return goodsType;
	}

	@Override
	public void add(GoodsType type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GoodsType type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
