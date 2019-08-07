package org.tud.zyao.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * id int(11) not null
 * name varchar(100) not null
 * pubdate date null
 * picture varchar(255) not null
 * price int(11) not null
 * startiny int(4) not null
 * intro text null
 * typeid int(11) not null
 * 
 * @author Shigo
 *
 */

public class Goods implements Serializable{
	private int id;
	private String name;
	private Date pubdate;
	private String picture;
	private double price;
	private int star;
	private String intro;
	private int typeId;
	
	//private int typeid;
	private GoodsType goodsType;

	public Goods(int id, String name, Date pubdate, String picture, double price, int star, String intro, int typeId,
			GoodsType goodsType) {
		super();
		this.id = id;
		this.name = name;
		this.pubdate = pubdate;
		this.picture = picture;
		this.price = price;
		this.star = star;
		this.intro = intro;
		this.typeId = typeId;
		this.goodsType = goodsType;
	}

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getPubdate() {
		return pubdate;
	}

	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public GoodsType getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}
	
	
	
}
