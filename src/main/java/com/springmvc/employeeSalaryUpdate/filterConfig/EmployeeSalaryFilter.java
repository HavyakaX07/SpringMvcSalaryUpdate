package com.springmvc.employeeSalaryUpdate.filterConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

@WebFilter("/updateSalary")
@Component("employeeSalary")
public class EmployeeSalaryFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// Check for salary 
				System.out.println("Salary filter");
				HttpServletRequest httprequest = (HttpServletRequest) request;
				String attr = (String) httprequest.getParameter("salary");
				long salary =Integer.parseInt(attr);
				if(salary>0)
					chain.doFilter(request, response);
				else {
					PrintWriter out = response.getWriter();
					out.write("EmployeeSalary should not be negative");
					out.close();
				}
		
	}


}
