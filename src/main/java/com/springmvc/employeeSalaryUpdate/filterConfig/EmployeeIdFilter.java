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
@Component("employeeIdFilter")
public class EmployeeIdFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//Check employeeId
				System.out.println("Employee Id filter");
				HttpServletRequest httprequest = (HttpServletRequest) request;
				long empId = Long.parseLong((String) httprequest.getParameter("employeeId"));
				if(empId>0)
					chain.doFilter(request, response);
				else {
					PrintWriter out = response.getWriter();
					out.write("EmployeeId should not be negative");
					out.close();
				}
		
	}
}
