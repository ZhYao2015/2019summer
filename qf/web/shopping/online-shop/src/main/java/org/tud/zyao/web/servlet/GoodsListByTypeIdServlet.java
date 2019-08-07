package org.tud.zyao.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tud.zyao.domain.Goods;
import org.tud.zyao.domain.PageBean;
import org.tud.zyao.service.GoodsService;
import org.tud.zyao.service.impl.GoodsServiceImpl;

@WebServlet("/getGoodsListByTypeId")
public class GoodsListByTypeIdServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GoodsService goodsService=new GoodsServiceImpl();
		String pn=req.getParameter("pageNum");
		String ps=req.getParameter("pageSize");
		String tid=req.getParameter("typeId");
		
		int pageNum=1;
		int pageSize=5;
		int typeId=0;
		
		if(pn!=null&&pn.trim().length()>0) {
			pageNum=Integer.parseInt(pn);
		}
		if(ps!=null&&ps.trim().length()>0) {
			pageSize=Integer.parseInt(ps);
		}
		if(tid!=null&&tid.trim().length()>0) {
			typeId=Integer.parseInt(tid);
		}
		
		PageBean<Goods> pageBean=goodsService.findByPage(pageNum, pageSize, typeId);
		req.setAttribute("pageBean", pageBean);
		
		req.getRequestDispatcher("/goodsList.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req,resp);
	}
	
}
