package org.tud.zyao.commons.context;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public final class SpringContext implements ApplicationContextAware,DisposableBean {
	
	private static Logger logger=LoggerFactory.getLogger(SpringContext.class);
	
	private static ApplicationContext applicationContext;

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		applicationContext=null;
	}
	
	public ApplicationContext getApplicationContext(){
		assertContextInjected();
		return applicationContext;
	}
	
	public static Object getBean(String beanId){
		assertContextInjected();
		return applicationContext.getBean(beanId);
	}
	
	public static Object getBean(Class clasz){
		assertContextInjected();
		return applicationContext.getBean(clasz);
	}
	
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		applicationContext=arg0;
	}
	
	public static void assertContextInjected(){
		if(applicationContext==null){
			logger.error("The spring context is not correctly instantiated.");
		}else{
			
		}
	}
}
