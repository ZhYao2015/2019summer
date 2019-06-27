package org.tud.zyao.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

//@WebListener
public class MyHttpServletRequestListener implements ServletRequestListener{

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		//ServletRequestListener.super.requestDestroyed(sre);
		System.out.println("request destroyed..."+sre.getServletRequest().hashCode());
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		// TODO Auto-generated method stub
		//ServletRequestListener.super.requestInitialized(sre);
		System.out.println("request initialized..."+sre.getServletRequest().hashCode());
	}

	
}
