package org.tud.zyao.filter;

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

import org.tud.zyao.bean.User;

/**
 * Servlet Filter implementation class AutoLoginFilter
 */
@WebFilter("/login.html")
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
		System.out.println("Autofilter destroyed...");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("Processing AutoLoginFilter  doFilter()...");
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse res=(HttpServletResponse)response;
		
		HttpSession session=req.getSession();
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			req.getRequestDispatcher("/index.html").forward(request, response);
			//res.sendRedirect(req.getContextPath()+"/index.html");
		}else {
			Cookie[] cookies=req.getCookies();
			if(cookies!=null) {
				for(Cookie c:cookies) {
					if("userInfo".equals(c.getName())) {
						String[] info=c.getValue().trim().split("#");
						if("admin".equals(info[0])&&"12345".equals(info[1])) {
							req.getRequestDispatcher("/index.html").forward(request, response);
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
		System.out.println("Autofilter initialized...");
	}

}
