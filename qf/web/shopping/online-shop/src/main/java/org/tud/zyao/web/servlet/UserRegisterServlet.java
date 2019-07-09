package org.tud.zyao.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.tud.zyao.domain.User;
import org.tud.zyao.service.UserService;
import org.tud.zyao.service.impl.UserServiceImpl;
import org.tud.zyao.utils.ActiveCodeUtils;
import org.tud.zyao.utils.Md5Utils;

/**
 * Servlet implementation class UserRegisterServlet
 */
@WebServlet("/userRegister")
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		HttpSession session=request.getSession();
		UserService userService=new UserServiceImpl();
		try {
			BeanUtils.populate(user, request.getParameterMap());
			if(user.getUsername()==null||user.getUsername().trim().equals("")) {
				session.setAttribute("registerMsg", "Username cannot be empty");
				response.sendRedirect("register.jsp");
				return;
			}
			
			if(user.getPassword()==null||user.getPassword().trim().equals("")) {
				session.setAttribute("registerMsg", "Password cannot be empty");
				response.sendRedirect("register.jsp");
				return;
			}
			
			if(user.getEmail()==null||user.getEmail().trim().equals("")) {
				session.setAttribute("registerMsg", "Email address cannot be empty");
				response.sendRedirect("register.jsp");
				return;
			}
			
			//default behaviour
			
			user.setFlag(0);
			user.setRole(1);
			user.setCode(ActiveCodeUtils.createActiveCode());
			
			user.setPassword(Md5Utils.md5(user.getPassword()));
			
			userService.add(user);
			
			//sending email
			//EmailUtils
			
			request.getRequestDispatcher("/registerSuccess.jsp").forward(request, response);
			
		} catch(Exception e) {
			session.setAttribute("registerMsg","UserRegisterServlet: BeanUtils populate error");
			response.sendRedirect("register.jsp");
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
