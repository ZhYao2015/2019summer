package org.tud.zyao.domain;

import java.io.Serializable;
import java.util.List;

public class PageBean implements Serializable{
	
	private int pageNum;
	private int pageSize;
	private int totalPage;
	private long totalCount;
	private List<Student> data;
	
	public PageBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageBean(int pageNum, int pageSize, long totalCount, List<Student> data) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.totalCount = totalCount;
		this.data = data;
		
		this.totalPage=(int) (this.totalCount%this.pageSize==0?this.totalCount/this.pageSize
				:this.totalCount/this.pageSize+1);
		
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public List<Student> getData() {
		return data;
	}
	public void setData(List<Student> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "PageBean [pageNum=" + pageNum + ", pageSize=" + pageSize + ", totalPage=" + totalPage + ", totalCount="
				+ totalCount + ", data=" + data + "]";
	}
	
	
}
