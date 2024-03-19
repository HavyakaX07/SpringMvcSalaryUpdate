package com.springmvc.employeeSalaryUpdate.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

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

}
