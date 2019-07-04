package org.tud.zyao.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.tud.zyao.domain.User;
import org.tud.zyao.service.UserService;
import org.tud.zyao.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserEditServlet
 */
@WebServlet("/UserEditServlet")
public class UserEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserEditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//beanUtils
		User user=new User();
		UserService userService=new UserServiceImpl();
		
		try {
			BeanUtils.populate(user,request.getParameterMap());
			userService.update(user);
			
			//response.sendRedirect(request.getContextPath()+"/userlist.jsp");
			
			//do not need to propagate information
			//response.sendRedirect(request.getContextPath()+"/UserListServlet");
			
			//window.location='somepath'
			response.getWriter().write("<script type='text/javascript'>alert('update success');window.location='"+request.getContextPath()+"/UserListServlet'"
					+ ";</script>");
		
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("/message.jsp").forward(request, response);
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
