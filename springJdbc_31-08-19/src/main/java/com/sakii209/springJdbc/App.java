package com.sakii209.springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sakii209.springJdbc.entites.Emp;
import com.sakii209.springJdbc.orm.EmployeeDao;
import com.sakii209.springJdbc.util.springConfig;

public class App 
{
	
    public static void main( String[] args )
    {
    	
    	ApplicationContext continer= new AnnotationConfigApplicationContext(springConfig.class);
    	
    	EmployeeDao employeeDao = continer.getBean(EmployeeDao.class);
    	Emp emp = continer.getBean(Emp.class);
    	emp.setEmpno(209);
    	emp.setEname("saikiran");
    	emp.setJob("Software");
    	employeeDao.saveEmp(emp);
   
    	AnnotationConfigApplicationContext.class.cast(continer).close();
    }
}
