package com.saki209.RestClient;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.saki209.Entity.Employee;

public class RestClient {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		URI uri;
		try {
			
			  uri = new URI("http://localhost:8080/emp"); ResponseEntity<Employee>
			  responseEntity = restTemplate.getForEntity(uri, Employee.class); Employee
			  employee = responseEntity.getBody(); System.out.println(employee.getEname());
			  System.out.println(employee.getEid());
			  System.out.println(employee.getSalary());
			 
			/*
			 * String url="http://localhost:8080/emp/{eid}/{ename}/{salary}";
			 * ResponseEntity<Employee> responseEntity = restTemplate.getForEntity(url,
			 * Employee.class, args[0],args[1],args[2]); Employee employee =
			 * responseEntity.getBody(); System.out.println(employee.getEname());
			 * System.out.println(employee.getEid());
			 * System.out.println(employee.getSalary());
			 */

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
