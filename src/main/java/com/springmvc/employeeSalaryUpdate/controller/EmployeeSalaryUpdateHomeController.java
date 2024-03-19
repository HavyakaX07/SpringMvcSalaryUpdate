package com.springmvc.employeeSalaryUpdate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.employeeSalaryUpdate.service.EmployeeSalaryUpdateService;

@Controller
public class EmployeeSalaryUpdateHomeController {
	
private EmployeeSalaryUpdateService employeeSalaryUpdateService;
	
	@Autowired
	public void setEmployeeSalaryUpdateDao(EmployeeSalaryUpdateService employeeSalaryUpdateService) {
		this.employeeSalaryUpdateService = employeeSalaryUpdateService;
	}
	
	 @RequestMapping("/home")
	    public String showHomePage() {
	        return "employeeSalaryHome";
	    }

	    
	
	 @RequestMapping("/updateSalary")
	public ModelAndView updateSalary(@RequestParam("employeeId") long employeeId,
            @RequestParam("salary") long salary) {
		employeeSalaryUpdateService.computeSalary(salary, employeeId);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("employeeSalaryUpdateSuccess");
		return mv;
	}

}
