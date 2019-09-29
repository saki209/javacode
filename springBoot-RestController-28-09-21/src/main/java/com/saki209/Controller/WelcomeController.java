package com.saki209.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saki209.Entity.Employee;

@RestController
public class WelcomeController {
	//simple get request 
	@RequestMapping(path = "/welcome")
	public String welcome() {
		return "welcome to the spring rest";
	}
	//get request to get employee object
	@RequestMapping(path="/emp",produces = {"application/xml","application/json"})
	public Employee findEmployee(){
		return new Employee(209,"saikiran",20000d);
	}
	//post request to send employee object along with request body
	@PostMapping(path = "/emp",consumes = {"application/xml","application/json"})
	public void saveEmployee(@RequestBody Employee employee) {
		System.out.println(employee.getEname());
		System.out.println(employee.getEid());
		System.out.println(employee.getSalary());
	}
	//get request parameters along with url
	@RequestMapping(path="/emp/{eid}/{ename}/{salary}",produces = {"application/xml","application/json"})
	public Employee getEmployee(@PathVariable("eid") Integer eid,@PathVariable("ename") String ename,@PathVariable("salary") Double salary) {
		return new Employee(eid, ename, salary);
	}
}
