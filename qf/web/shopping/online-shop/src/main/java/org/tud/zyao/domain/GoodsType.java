package org.tud.zyao.domain;

import java.io.Serializable;

/**
 * 
 * @author Shigo
 *
 * id int(11) not null
 * name varchar(50) not null
 * level int(11) null
 * parent int(11) null
 */

public class GoodsType implements Serializable{
	private int id;
	private String name;
	private int level;
	private int parent;
	public GoodsType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GoodsType(int id, String name, int level, int parent) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.parent = parent;
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
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	@Override
	public String toString() {
		return "GoodsType [id=" + id + ", name=" + name + ", level=" + level + ", parent=" + parent + "]";
	}
	
	
}
