package org.tud.zyao.domain;

import java.io.Serializable;
import java.util.List;

public class PageBean<T> implements Serializable{
	private int pageNum;
	private int pageSize;
	private int totalPage;
	private long totalCount;
	private List<T> data;
	
	private int startPage;
	private int endPage;
	
	//前五后四
	
	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}



	public PageBean(int pageNum, int pageSize, long totalCount, List<T> data) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.data = data;
		
		totalPage=(int) (totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
	}
	
	
}
