package com.aranea.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.aranea.db.Dbconn;



@WebServlet("/Del")
public class Delate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Delate() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    
		    String edit_u_name = request.getParameter("edit_u_name");
			try {
				new Dbconn().delateData(edit_u_name);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			response.sendRedirect("admin.jsp");
		}
	}



