package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.didongbean_LeVietDat;
import bo.didongbo_LeVietDat;
import dao.didongdao_LeVietDat;

/**
 * Servlet implementation class cuahangController
 */
@WebServlet("/cuahangController")
public class cuahangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cuahangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String key = request.getParameter("txttk");
		
		didongbo_LeVietDat dd = new didongbo_LeVietDat();
		ArrayList<didongbean_LeVietDat> ds = dd.getdidong();
		
		if(ds!=null) {
	    	if(key!=null) {
	    		ds=dd.timkiem(key);
	    	}
	    }
		
		request.setAttribute("didong", ds);
		RequestDispatcher rd=request.getRequestDispatcher("htcuahang.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
