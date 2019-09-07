package com.sakii209.springJdbc.orm;

import com.sakii209.springJdbc.entites.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;



@Configuration
public class EmployeeDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void saveEmp(Emp emp) {
		
		String query="insert into emp(empno,ename,job) values(?,?,?)";
		jdbcTemplate.update(query,emp.getEmpno(),emp.getEname(),emp.getJob());
		
	}

}
