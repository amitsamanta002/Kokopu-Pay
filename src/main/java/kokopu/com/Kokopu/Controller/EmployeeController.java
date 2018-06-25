package kokopu.com.Kokopu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kokopu.com.Kokopu.model.Employee;
import kokopu.com.Kokopu.service.EmployeeDetail;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDetail employeeDetail;
	
	@RequestMapping("/payrole/{empId}")
	public Employee getOrderdetail(@PathVariable("empId") int empId) {
		
		return employeeDetail.getEmployeeDetails(empId);
		
	}

}
