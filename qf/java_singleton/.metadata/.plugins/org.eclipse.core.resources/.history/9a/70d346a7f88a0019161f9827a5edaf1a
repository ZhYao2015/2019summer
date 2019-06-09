package org.tud.zyao.commons.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class SpringContext {
	
	public ApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
	public Object getBean(String beanId){
		return context.getBean(beanId);
	}
}
