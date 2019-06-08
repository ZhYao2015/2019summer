package org.selfservice.ui;

import java.util.Date;
import java.util.List;

import org.selfservice.bean.Clothes;
import org.selfservice.bean.Order;
import org.selfservice.bean.OrderItem;
import org.selfservice.service.ClothesService;
import org.selfservice.service.OrderService;
import org.selfservice.service.impl.ClothesServiceImpl;
import org.selfservice.service.impl.OrderServiceImpl;
import org.selfservice.utils.BusinessException;
import org.selfservice.utils.ConsoleTable;
import org.selfservice.utils.DataUtils;

public class HomeClass extends BaseClass{
	
	private OrderService orderService=new OrderServiceImpl();
	private ClothesService clothesService=new ClothesServiceImpl();
	
	public void show(){
		showProducts();
		println("welcome:"+currentUser.getUsername());
		boolean flag=true;
		while(flag){
			println(getString("home.function"));
			println(getString("info.select"));
			String select=input.nextLine();
			switch(select){
			case "1"://query the orderlist
				findList();
				flag=false;
				break;
			case "2"://query an order
				findOrderById();
				flag=false;
				break;
			case "3"://purchase
				try{
					buyProducts();
					flag=false;
					
				}catch(BusinessException e){
					println(e.getMessage());
				}
				break;
			case "0"://quit
				flag=false;
				System.out.println("exit");
			default:
				println(getString("input.error"));
				break;
			}
		}
	}
	
	private void buyProducts() throws BusinessException{
		// TODO Auto-generated method stub
		//generate order
		boolean flag=true;
		int count=1;
		Order order=new Order();
		float sum=0.0f;
		
		while(flag){
			println(getString("product.input.id"));
			String id=input.nextLine();
			println(getString("product.input.shoppingNum"));
			String shoppingNum=input.nextLine();
			
			OrderItem orderItem=new OrderItem();
			
			Clothes clothes=clothesService.findById(id);
			int num=Integer.parseInt(shoppingNum);
			if(num>clothes.getNum()){
				throw new BusinessException("product.num.error");
			}
			
			//an orderItem
			orderItem.setClothes(clothes);
			orderItem.setShoppingnum(num);
			orderItem.setSum(clothes.getPrice()*num);
			
			sum+=orderItem.getSum();
			
			orderItem.setItemId(count++);
			order.getOrderItemList().add(orderItem);
		}
		order.setCreateDate(DataUtils.toDate(new Date()));
		order.setUserId(currentUser.getId());
		order.setSum(sum);
		order.setOrderId(orderService.list().size()+1);
		orderService.buyProduct(order);
		
		println(getString("product.buy.continue"));
		String isBuy=input.nextLine();
		switch(isBuy){
			case "1":
				break;
			case "2":
				flag=false;
				break;
		}
		
	}
	

	private void findOrderById() {
		// TODO Auto-generated method stub
		
	}

	private void findList() {
		// TODO Auto-generated method stub
		
	}

	private void showProducts(){
		ClothesService clothesService=new ClothesServiceImpl();
		List<Clothes> list=clothesService.list();
		
		ConsoleTable t=new ConsoleTable(8,true);
		t.appendRow();
		t.appendColum("id")
		.appendColum("brand")
		.appendColum("style")
		.appendColum("color")
		.appendColum("size")
		.appendColum("num")
		.appendColum("price")
		.appendColum("description");
		
		for(Clothes c:list){
			t.appendRow();
			t.appendColum(c.getId())
			.appendColum(c.getBrand())
			.appendColum(c.getStyle())
			.appendColum(c.getColor())
			.appendColum(c.getSize())
			.appendColum(c.getNum())
			.appendColum(c.getPrice())
			.appendColum(c.getDescription());
		}
		
		println(t.toString());
	}
}
