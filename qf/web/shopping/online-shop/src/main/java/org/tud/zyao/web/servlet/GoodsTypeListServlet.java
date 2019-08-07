package org.tud.zyao.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tud.zyao.domain.GoodsType;
import org.tud.zyao.service.GoodsTypeService;
import org.tud.zyao.service.impl.GoodsTypeServiceImpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

@WebServlet("/goodsTypeList")
public class GoodsTypeListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}
	
	public String goodstypelist(HttpServletRequest request, HttpServletResponse response) throws IOException {
		GoodsTypeService goodsTypeService=new GoodsTypeServiceImpl();
		List<GoodsType> goodsTypeList=goodsTypeService.finaAll();
		//to json...
		String json=JSON.toJSONString(goodsTypeList,SerializerFeature.WRITE_MAP_NULL_FEATURES);
		
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out=response.getWriter();
		out.write(json);
		return null;
		
	}
}
