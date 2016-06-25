package com.aranea.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aranea.db.Dbconn;

/**
 * Servlet implementation class Edit_Manger
 */
@WebServlet("/Edit")
public class Edit_Manger extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit_Manger() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String edit_f_name = request.getParameter("edit_f_name");
		String edit_l_name = request.getParameter("edit_l_name");
		String edit_u_name = request.getParameter("edit_u_name");
		String edit_pass = request.getParameter("edit_password");
		String edit_priv = request.getParameter("edit_priv");
		System.out.println(edit_f_name);
		@SuppressWarnings("unused")
		String edit_data_auth = "2016-04-06";
		@SuppressWarnings("unused")
		String edit_archive = "0" ;
		if(edit_f_name==null || edit_u_name == null || edit_l_name == null || edit_pass == null || edit_priv == null ||
		   edit_f_name=="" || edit_u_name == "" || edit_l_name == "" || edit_pass == "" || edit_priv == ""
		   
		   ){
			
			response.sendRedirect("admin.jsp");
		}
		else{
			
			try {
				new Dbconn().replaceData(edit_f_name, edit_l_name, edit_u_name, edit_pass,edit_priv);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("admin.jsp");
			
		
		}
	}

}
