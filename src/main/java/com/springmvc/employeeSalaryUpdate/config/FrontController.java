package com.springmvc.employeeSalaryUpdate.config;

import javax.servlet.Filter;

import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.springmvc.employeeSalaryUpdate.filterConfig.EmployeeIdFilter;
import com.springmvc.employeeSalaryUpdate.filterConfig.EmployeeSalaryFilter;

public class FrontController extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//Give the servlet configuration file
		return new Class[] {EmployeeSalaryUpdateConfigurationFile.class};
	}

	@Override
	protected String[] getServletMappings() {
		// Give the URL pattern
		return new String[] {"/"};
	}
	
	/*
	 * Configure the filter.
	 * Filter might be useful for security purpose.
	 * We can chain the Filter and at the end it will delegate to the servlet that is mapped for.
	 * We can make use of @Order annotation but it is not working here.
	 * So in-order to change the chaining of the filter order we can change the order here only.
	 */
	@Override
	 protected Filter[] getServletFilters() {
		 //EmpId filter 
		 DelegatingFilterProxy delegateFilterProxyForEmpid = new DelegatingFilterProxy();
		 delegateFilterProxyForEmpid.setTargetBeanName("employeeSalary");
		 
		 //EmpSal filter
		 DelegatingFilterProxy delegateFilterProxyForEmpSalary = new DelegatingFilterProxy();
		 delegateFilterProxyForEmpSalary.setTargetBeanName("employeeSalary");
	        
		 return new Filter[]{delegateFilterProxyForEmpid,delegateFilterProxyForEmpSalary};
	        
	        //return new Filter[]{new EmployeeIdFilter(), new EmployeeSalaryFilter()};
	    }

}
