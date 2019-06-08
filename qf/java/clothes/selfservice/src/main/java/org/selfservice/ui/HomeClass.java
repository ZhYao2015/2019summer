package org.selfservice.ui;

import java.util.List;

import org.selfservice.bean.Clothes;
import org.selfservice.service.ClothesService;
import org.selfservice.service.impl.ClothesServiceImpl;
import org.selfservice.utils.ConsoleTable;

public class HomeClass extends BaseClass{
	
	public void show(){
		showProducts();
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
