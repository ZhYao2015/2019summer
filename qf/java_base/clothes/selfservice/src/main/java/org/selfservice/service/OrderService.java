package org.selfservice.service;

import java.util.List;

import org.selfservice.bean.Order;
import org.selfservice.utils.BusinessException;

public interface OrderService {
	public void buyProduct(Order o) throws BusinessException;
	public List<Order> list() throws BusinessException;
	public Order findById(int orderId) throws BusinessException;
	
}
