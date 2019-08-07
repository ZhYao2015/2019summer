package org.tud.zyao.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tud.zyao.domain.BuyCart;
import org.tud.zyao.domain.BuyItem;
import org.tud.zyao.domain.Goods;
import org.tud.zyao.domain.User;
import org.tud.zyao.service.GoodsService;
import org.tud.zyao.service.impl.GoodsServiceImpl;

@WebServlet("/addCart")
public class addCartServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//been logged in or not
		User user=(User) req.getSession().getAttribute("user");
		if(user==null) {
			resp.sendRedirect(req.getContextPath()+"/login.jsp");
		}
		
		int goodsId=Integer.parseInt(req.getParameter("goodsId"));
		GoodsService goodsService=new GoodsServiceImpl();
		Goods goods=goodsService.findById(goodsId);
		//get cart from sessions
		BuyCart cart=(BuyCart) req.getSession().getAttribute("cart");
		if(cart==null) {
			cart=new BuyCart();
			//
			req.getSession().setAttribute("cart", cart);
		}
		
		cart.addBuyItem(new BuyItem(goods,1));
		resp.sendRedirect(req.getContextPath()+"/cartSuccess.jsp");
		
		//adding to database
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
