package com.aranea.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aranea.db.Dbconn;

@WebServlet("/reg")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String f_name = request.getParameter("f_name");
		String l_name = request.getParameter("l_name");
		String u_name = request.getParameter("u_name");
		String pass = request.getParameter("password");
		String priv = request.getParameter("priv");
		String data_auth = "2016-06-05";
		String archive = "0" ;
		int id=1;
		if(f_name==null || u_name == null || l_name == null || pass == null || priv == null ||
		   f_name=="" || u_name == "" || l_name == "" || pass == "" || priv == ""
		   
		   ){
			
			response.sendRedirect("sign_in.jsp");
		}
		else{
			
			try {
				new Dbconn().insertData(id,f_name, l_name, u_name, pass,priv,data_auth,archive);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("admin.jsp");
		}
	}

}
