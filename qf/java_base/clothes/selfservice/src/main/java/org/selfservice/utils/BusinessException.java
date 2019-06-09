package org.selfservice.utils;

public class BusinessException extends RuntimeException {
	public BusinessException(){
		super();
	}
	
	public BusinessException(String errorMsg){
		super(errorMsg);
	}
}
