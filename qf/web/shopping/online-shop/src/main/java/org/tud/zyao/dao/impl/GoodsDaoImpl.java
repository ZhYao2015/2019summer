package org.tud.zyao.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.tud.zyao.dao.GoodsDao;
import org.tud.zyao.dao.GoodsTypeDao;
import org.tud.zyao.domain.Goods;
import org.tud.zyao.domain.GoodsType;
import org.tud.zyao.utils.DruidUtils;

public class GoodsDaoImpl implements GoodsDao{

	QueryRunner qr=new QueryRunner(DruidUtils.getDataSource());
	
	@Override
	public List<Goods> findByPage(int pageNum, int pageSize, int typeId) {
		// TODO Auto-generated method stub
		List<Goods> list=null;
		String sql="";
		if(typeId>0) {
			//hasType
			sql="select * from tb_goods where typeId=? limit ?,?";
			try {
				list=qr.query(sql,new BeanListHandler<Goods>(Goods.class),
					typeId,pageNum,pageSize
				);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			//not classified
			sql="select * from tb_goods limit ?,?";
			try {
				list=qr.query(sql,new BeanListHandler<Goods>(Goods.class),
					pageNum,pageSize
				);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			list=qr.query(sql,new BeanListHandler<Goods>(Goods.class),
				typeId,pageNum,pageSize
			);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Goods> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Goods goods) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Goods goods) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long findCount(int typeId) {
		// TODO Auto-generated method stub
		String sql="";
		Long count=0l;
		if(typeId>0) {
			sql="select count(*) from tb_goods where typeId=?";
			try {
				count=(Long)qr.query(sql, new ScalarHandler(),typeId);
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}else {
			sql="select count(*) from tb_goods";
			try {
				count=(Long)qr.query(sql, new ScalarHandler());
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		return count;
	}

	@Override
	public Goods findById(int id) {
		// TODO Auto-generated method stub
		Goods goods=null;
		try {
			goods=qr.query("select * from tb_goods where id=?", new ResultSetHandler<Goods>() {

				@Override
				public Goods handle(ResultSet rs) throws SQLException {
					// TODO Auto-generated method stub
					Goods g=new Goods();
					g.setId(rs.getInt("id"));
					g.setName(rs.getString("name"));
					g.setPicture(rs.getString("picture"));
					g.setPrice(rs.getDouble("price"));
					g.setPubdate(rs.getDate("pubdate"));
					g.setStar(rs.getInt("star"));
					g.setIntro(rs.getString("intro"));
					
					int typeId=rs.getInt("typeId");
					//query according to catagory id
					GoodsTypeDao goodsTypeDao=new GoodsTypeDaoImpl();
					GoodsType goodsType=goodsTypeDao.findById(typeId);
					g.setGoodsType(goodsType);
					return g;
				}
				
			} ,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("GoodsDaoImpl: failed when querying with item id");
		}
		
		return goods;
	}
	
}
