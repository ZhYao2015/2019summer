package org.tud.zyao.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tud.zyao.domain.PageBean;
import org.tud.zyao.service.StudentService;
import org.tud.zyao.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class ListStudentServlet
 */
@WebServlet("/ListStudentServlet")
public class ListStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListStudentServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//recceive pageNum pageSize
		String pageNum=request.getParameter("pageNum");
		String pageSize=request.getParameter("pageSize");
		int pnum=1;
		int psize=5;
		
		if(pageNum!=null&&!pageNum.trim().equals("")) {
			pnum=Integer.parseInt(pageNum);
		}
		
		if(pageSize!=null&&!pageSize.trim().equals("")) {
			psize=Integer.parseInt(pageSize);
		}
		
		StudentService studentService=new StudentServiceImpl();
		PageBean pageBean=studentService.findByPage(pnum, psize);
	
		request.setAttribute("pageBean", pageBean);
		
		request.getRequestDispatcher("/listStudent.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
