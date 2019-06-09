package org.selfservice.service.impl;

import java.util.List;

import org.selfservice.bean.Order;
import org.selfservice.service.OrderService;
import org.selfservice.utils.BusinessException;
import org.selfservice.utils.OrderIO;

public class OrderServiceImpl implements OrderService{

	private OrderIO orderIO=new OrderIO();
	@Override
	public void buyProduct(Order o) throws BusinessException {
		// TODO Auto-generated method stub
		orderIO.add(o);
		
	}

	@Override
	public List<Order> list() throws BusinessException {
		// TODO Auto-generated method stub
		return orderIO.list();
	}

	@Override
	public Order findById(int orderId) throws BusinessException {
		// TODO Auto-generated method stub
		return orderIO.findByOrderId(orderId);
	}

}
