package com.springmvc.employeeSalaryUpdate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = {"com.springmvc.employeeSalaryUpdate"})
public class EmployeeSalaryUpdateConfigurationFile {
	
	@Bean
	public InternalResourceViewResolver getViewResolver() {
		InternalResourceViewResolver internalViewResolver = new InternalResourceViewResolver();
		internalViewResolver.setSuffix(".jsp");
		internalViewResolver.setPrefix("/WEB-INF/views/");
		return internalViewResolver;
	}

}
