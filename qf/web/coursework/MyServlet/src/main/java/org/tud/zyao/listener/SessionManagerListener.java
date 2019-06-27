package org.tud.zyao.listener;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionManagerListener implements HttpSessionListener,ServletContextListener {

	
	private  Object lock=new Object();
	
	private Timer timer;
	private  List<HttpSession> sessions= new LinkedList<HttpSession>();
	
	
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		//ServletContextListener.super.contextInitialized(sce);
		timer=new Timer();
		timer.schedule(new MyTimerTask(),0,60*1000);
		sce.getServletContext().setAttribute("sessions", sessions);
		System.out.println("start the Timer...");
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		//ServletContextListener.super.contextDestroyed(sce);
		
	}

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		//HttpSessionListener.super.sessionCreated(se);
		synchronized (lock) {
			sessions.add(se.getSession());
			System.out.println("session added:"+se.getSession().hashCode());
		}
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		//HttpSessionListener.super.sessionDestroyed(se);
		System.out.println("session destroyed:"+se.getSession().hashCode());
	}
	
	private class MyTimerTask extends TimerTask{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			Iterator iterator=sessions.iterator();
			synchronized (lock) {
				while(iterator.hasNext()) {
					HttpSession session=(HttpSession) iterator.next();
					if((System.currentTimeMillis()-session.getLastAccessedTime())>60*1000) {
						session.invalidate();
						//really important
						iterator.remove();
					}else {
						
						
					}
				}
			}
			
		}	
	}
}
