package org.selfservice.bean;

import java.io.Serializable;

public class OrderItem implements Serializable{
	
	private int itemId;
	private Clothes clothes;
	private int shoppingnum;
	private float sum;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public Clothes getClothes() {
		return clothes;
	}
	public void setClothes(Clothes clothes) {
		this.clothes = clothes;
	}
	public int getShoppingnum() {
		return shoppingnum;
	}
	public void setShoppingnum(int shoppingnum) {
		this.shoppingnum = shoppingnum;
	}
	public float getSum() {
		return sum;
	}
	public void setSum(float sum) {
		this.sum = sum;
	}
	public OrderItem(int itemId, Clothes clothes, int shoppingnum, float sum) {
		super();
		this.itemId = itemId;
		this.clothes = clothes;
		this.shoppingnum = shoppingnum;
		this.sum = sum;
	}
	
	public OrderItem(){
		
	}
	
}
