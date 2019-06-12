package org.tud.zyao.myshop.web.admin.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.tud.zyao.myshop.commons.constant.ConstantUtils;
import org.tud.zyao.myshop.domain.User;

public class LoginInterceptor implements HandlerInterceptor{

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object arg2, ModelAndView modelAndView)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		User user=(User) httpServletRequest.getSession().getAttribute(ConstantUtils.SESSION_USER);
		if(user==null){
			httpServletResponse.sendRedirect("login");
		}

		return true;
	}

}
