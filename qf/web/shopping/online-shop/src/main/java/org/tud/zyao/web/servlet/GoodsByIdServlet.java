package org.tud.zyao.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tud.zyao.domain.Goods;
import org.tud.zyao.service.GoodsService;
import org.tud.zyao.service.impl.GoodsServiceImpl;

/**
 * Servlet implementation class GoodsByIdServlet
 */
@WebServlet("/getGoodsById")
public class GoodsByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoodsByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		GoodsService goodsService=new GoodsServiceImpl();
		Goods goods=goodsService.findById(id);
		
		request.setAttribute("goods", goods);
		request.getRequestDispatcher("/goodsDetail.jsp")
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
