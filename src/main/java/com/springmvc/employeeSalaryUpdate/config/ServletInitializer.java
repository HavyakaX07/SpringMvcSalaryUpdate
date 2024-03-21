package com.springmvc.employeeSalaryUpdate.config;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.filter.DelegatingFilterProxy;

import com.springmvc.employeeSalaryUpdate.filterConfig.EmployeeIdFilter;
import com.springmvc.employeeSalaryUpdate.filterConfig.EmployeeSalaryFilter;

public class ServletInitializer implements WebApplicationInitializer {
	 @Override
	    public void onStartup(ServletContext servletContext) throws ServletException {
	       // registerFilter(servletContext, "loggingFilter", EmployeeIdFilter.class, 2);
	       // registerFilter(servletContext, "customHeaderFilter", EmployeeSalaryFilter.class, 1);
	    }

	 /*
	    private void registerFilter(ServletContext servletContext, String filterName, Class<? extends Filter> filterClass, int order) {
	        FilterRegistration.Dynamic registration = servletContext.addFilter(filterName, new DelegatingFilterProxy(filterName, filterClass));
	        registration.addMappingForUrlPatterns(null, false, "/hello");
	        registration.setOrder(order);
	    }
	    */
}