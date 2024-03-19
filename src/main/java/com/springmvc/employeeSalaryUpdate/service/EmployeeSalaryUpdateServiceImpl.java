package com.springmvc.employeeSalaryUpdate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.employeeSalaryUpdate.dao.EmployeeSalaryUpdateDao;

@Component
public class EmployeeSalaryUpdateServiceImpl implements EmployeeSalaryUpdateService {

	private EmployeeSalaryUpdateDao employeeSalaryUpdateDao;
	
	@Autowired
	//Un-comment this in order to execute via mongo-db
	//@Qualifier("MongoDb")
	public void setEmployeeSalaryUpdateDao(EmployeeSalaryUpdateDao employeeSalaryUpdateDao) {
		this.employeeSalaryUpdateDao = employeeSalaryUpdateDao;
	}
	
	
	@Override
	public void computeSalary(long grossSalary, long empId) {
		//Lets assume some intensive computation is calculated here.
		//after that update the calculated info into db.
		System.out.println("Calculating salary");
		long netSalary = grossSalary-100;
		employeeSalaryUpdateDao.updateSalary(netSalary , empId);

	}


}
