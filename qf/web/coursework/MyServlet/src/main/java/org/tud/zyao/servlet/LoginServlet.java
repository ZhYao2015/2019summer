package org.tud.zyao.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.tud.zyao.bean.User;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/LoginServlet") //The requested address from the web browser
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Processing LoginServlet doGet()...");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if("admin".equals(username)&&"12345".equals(password)) {
			HttpSession session=request.getSession();
			User user=new User(username,password);
			
			session.setAttribute("user", user);
			
			Cookie cookie=new Cookie("userInfo",username+"#"+password);
			cookie.setMaxAge(60*60*24*7);
			cookie.setPath("/");
			cookie.setHttpOnly(true);
			response.addCookie(cookie);
			
			//response.sendRedirect(request.getContextPath()+"/index.html");
			request.getRequestDispatcher("/index.html").forward(request, response);
			return;
		}
		response.sendRedirect(request.getContextPath()+"/login.html");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
