package kokopu.com.Kokopu.service.impl;

import org.springframework.stereotype.Component;

import kokopu.com.Kokopu.dao.EmployeeBasicdetails;
import kokopu.com.Kokopu.model.Employee;
import kokopu.com.Kokopu.service.EmployeeDetail;

@Component
public class EmployeeServImpl implements EmployeeDetail{

	@Override
	public Employee getEmployeeDetails(int empId) {
		EmployeeBasicdetails employeeBasicdetails = new EmployeeBasicdetails();
		return employeeBasicdetails.getEmployeeBasicdetails(empId);
	}

}
