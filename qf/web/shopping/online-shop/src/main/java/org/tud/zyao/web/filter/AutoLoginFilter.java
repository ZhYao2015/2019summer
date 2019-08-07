package org.tud.zyao.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.tud.zyao.domain.User;
import org.tud.zyao.service.UserService;
import org.tud.zyao.service.impl.UserServiceImpl;

/**
 * Servlet Filter implementation class AutoLoginFilter
 */
@WebFilter("/*")
public class AutoLoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AutoLoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse resp=(HttpServletResponse) response;
		Cookie[] cookies=req.getCookies();
		
		HttpSession session=req.getSession();
		
		if(session.getAttribute("user")==null) {
			if(cookies!=null) {
				for(Cookie cookie:cookies) {
					if("userInfo".equals(cookie.getName())) {
						String value=cookie.getValue();
						String userInfo[]=value.split("#");
						
						UserService userService=new UserServiceImpl();
						User user=userService.login(userInfo[0], userInfo[1]);
						if(user!=null) {
							session.setAttribute("user", user);
							resp.sendRedirect(req.getContextPath()+"/index.jsp");
							return;
						}
						
					}
				}
			}
		}
		
		
		
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
