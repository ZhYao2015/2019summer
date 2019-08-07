package org.tud.zyao.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.tud.zyao.dao.BuyCartDao;
import org.tud.zyao.dao.GoodsDao;
import org.tud.zyao.domain.BuyItem;
import org.tud.zyao.utils.DruidUtils;

public class BuyCartDaoImpl implements BuyCartDao{

	private QueryRunner qr=new QueryRunner(DruidUtils.getDataSource());
	
	@Override
	public List<BuyItem> findById(int id) {
		// TODO Auto-generated method stub
		qr.query("select * from tb_cart where id=?", new ResultSetHandler<List<BuyItem>>() {

			@Override
			public List<BuyItem> handle(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				List<BuyItem> list=new ArrayList<BuyItem>();
				while(rs.next()) {
					BuyItem buyItem=new BuyItem();
					
					GoodsDao goodsDao=new GoodsDaoImpl();
					goodsDao.findById(id);
					
					buyItem.setGoods(goods);
					rs.getInt("pid");
				}
			}
			
		})
		return null;
	}

	@Override
	public void add(BuyItem buyItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BuyItem buyItem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int userId, int gId) {
		// TODO Auto-generated method stub
		
	}

}
