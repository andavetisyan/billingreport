package com.aranea.web;
import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter
(

  filterName="authFilter",
  urlPatterns={"*.jsp"},
  dispatcherTypes={DispatcherType.REQUEST, DispatcherType.ASYNC} 


)
public class AuthFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		   // chain.doFilter(request, response);
		   HttpSession session = ((HttpServletRequest)request).getSession();
		   if(session.getAttribute("username") != null){
			   chain.doFilter(request, response); 
		   }else{
			   ((HttpServletResponse)response).sendRedirect("login");
		   }
		    
		    
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
