package org.tud.zyao.servlet;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


/**
 * Servlet implementation class UploadFileServlet
 */
@WebServlet("/UploadFileServlet")
@MultipartConfig(fileSizeThreshold=1024*100,maxFileSize=1024*1024*2,maxRequestSize=1024*1024*20)
public class UploadFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UploadFileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Collection<Part> parts=request.getParts();
		if(parts!=null) {
			for(Part part:parts) {
				String file_name=part.getSubmittedFileName();
				if(file_name!=null) {
					//is file
					String newFilePath=request.getServletContext().getRealPath("/")+file_name;
					part.write(newFilePath);
					System.out.println("Uploaded file.");
					response.getWriter().write("Uploaded file."+file_name);
				}else {
					//not a file
					String name=part.getName();
					String value=request.getParameter(name);
					System.out.println(name+"..."+value);
				}
			}
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
