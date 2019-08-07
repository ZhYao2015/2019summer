package org.tud.zyao.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.tud.zyao.domain.User;
import org.tud.zyao.service.UserService;
import org.tud.zyao.service.impl.UserServiceImpl;

@WebServlet("/userLogin")
public class UserLoginServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		UserService userService=new UserServiceImpl();
		User user=userService.login(username, password);
		
		HttpSession session=request.getSession();
		
		
		
		if(user!=null) {
			
			if(user.getFlag()==0) {
				String location=request.getContextPath()+"/login.jsp";
				response.getWriter().write("<script>alert('Not activated.');window.location='"+location+"'</script>");
				return;
			}
			
			String auto=request.getParameter("auto");
			
			if(auto!=null) {
				Cookie cookie=new Cookie("userinfo",username+"#"+password);
				cookie.setMaxAge(60*60*24*14);
				cookie.setHttpOnly(true);
				cookie.setPath("/");
				response.addCookie(cookie);
			}
			session.setAttribute("user", user);
			//request.getRequestDispatcher("/index.jsp").forward(request, response);
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}else {
			request.setAttribute("msg", "login failed");
			request.getRequestDispatcher("/message.jsp").forward(request, response);
		}
		
		
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req,resp);
	}
	
}
