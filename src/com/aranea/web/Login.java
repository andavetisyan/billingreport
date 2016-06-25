package com.aranea.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aranea.db.Dbconn;
import com.aranea.rep.Manager;
@WebServlet("/login")
public class Login extends HttpServlet {
	
	private static final Map <String,String> userDatabase = new Hashtable<>();
	
	static {
		
		userDatabase.put("bzez", "bzez");
		
	}
	
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session  = request.getSession();
		if(session.getAttribute("username") != null){
			response.sendRedirect("index.jsp");
			return;
			
		}else{
		 
		  request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
       
		
		
	
		HttpSession session  = request.getSession();
		
		if(request.getParameter("logout") != null){
			
			session.removeAttribute("username");
			request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
			
		}else{
			if(request.getParameter("username") != null && request.getParameter("password") != null && this.checkUser(request.getParameter("username"), request.getParameter("password"))!=null){
				
					session.setAttribute("username", request.getParameter("username"));
					session.setAttribute("priv", this.checkUser(request.getParameter("username"), request.getParameter("password")).getId());
					response.sendRedirect("index.jsp");
					request.changeSessionId();
					return;
			}else{
				
				request.setAttribute("LoginFailed", true);
				request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request, response);
				return;
			}
		
		}
	
	}
	
	
	private Manager checkUser (String username,String password) {
		Dbconn db = new Dbconn();
		
		Manager m=null;
		
		ArrayList<Manager> manArr=null;
		
		 try {
			manArr = db.getMangerList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(int i = 0; i < manArr.size();i++){
			if(manArr.get(i).getU_name().equals(username) && manArr.get(i).getPass().equals(password)){
				//
				m=manArr.get(i);
				
			}
		}
		return m;
	}

}
