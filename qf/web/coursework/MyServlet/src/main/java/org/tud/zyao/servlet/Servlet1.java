package org.tud.zyao.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/Servlet1")
public class Servlet1 implements Servlet{

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Initialized.");
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("getServletConfig executed.");
		return null;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service running...");
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("getServletInfo executed.");
		return null;
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroyed");
	}

}
