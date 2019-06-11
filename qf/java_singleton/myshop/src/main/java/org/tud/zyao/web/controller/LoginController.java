package org.tud.zyao.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.tud.zyao.commons.constant.ConstantUtils;
import org.tud.zyao.entity.User;
import org.tud.zyao.service.UserService;

@Controller
public class LoginController{
	
	@Autowired
	private UserService userService;
	
	/**
	 * If you search for a path of 'login' with the GET method, then
	 * this login() method will be invoked.
	 * @return
	 */
	@RequestMapping(value={"","login"}, method=RequestMethod.GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(@RequestParam(required=true)String email, 
			@RequestParam(required=true) String password, HttpServletRequest httpServletRequest){
		
		User user=userService.login(email, password);
		
		if(user==null){
			return login();
		}else{
			
			httpServletRequest.getSession().setAttribute(ConstantUtils.SESSION_USER, user);
			
			//return "main";
			return "redirect:main";
		}
	}
	
}	
	
	
	
	
	
//	private UserService userService;
//	
//	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		userService=(UserService) SpringContext.getBean("userService");
//		userService.SayHi();
//
//	}
//
//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		String email=req.getParameter("email");
//		String password=req.getParameter("password");
//
//		SpringContext context=new SpringContext();
//		UserService userService=(UserService)context.getBean("userService");
//
//		User uAdmin=userService.login(email, password);
//		
//		if(uAdmin!=null){
//			resp.sendRedirect("main.jsp");
//		}
//		//...
//		else{
//			req.getRequestDispatcher("index.jsp").forward(req, resp);
//		}
//	}

