package com.springmvc.employeeSalaryUpdate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


/*
 *  Mongo-DB way of updating salary into db
 */

@Component
@Qualifier("MongoDb")
public class EmployeeSalaryUpdateDaoMongoDBImpl implements EmployeeSalaryUpdateDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void updateSalary(long salary, long empId) {
		//Lets assume this will update the salary in mongo-db way.
		System.out.println("Update done using mongo db approach!");

	}

}
