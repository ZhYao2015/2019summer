package org.tud.zyao.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tud.zyao.commons.context.SpringContext;
import org.tud.zyao.entity.User;
import org.tud.zyao.service.UserService;

public class LoginController extends HttpServlet {

	private UserService userService;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		userService=(UserService) SpringContext.getBean("userService");
		userService.SayHi();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=req.getParameter("email");
		String password=req.getParameter("password");

		SpringContext context=new SpringContext();
		UserService userService=(UserService)context.getBean("userService");

		User uAdmin=userService.login(email, password);
		
		if(uAdmin!=null){
			resp.sendRedirect("main.jsp");
		}
		//...
		else{
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}

}
