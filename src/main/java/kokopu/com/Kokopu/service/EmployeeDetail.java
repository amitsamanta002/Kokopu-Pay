package kokopu.com.Kokopu.service;

import org.springframework.stereotype.Service;

import kokopu.com.Kokopu.model.Employee;


@Service
public interface EmployeeDetail {
	
	public Employee getEmployeeDetails(long empId);

}
