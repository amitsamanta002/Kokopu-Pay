package kokopu.com.Kokopu.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.QueryParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kokopu.com.Kokopu.model.Employee;
import kokopu.com.Kokopu.model.GetdataObject;
import kokopu.com.Kokopu.service.EmployeeDetail;

@RestController
public class EmployeeController {
	
	private static Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeDetail employeeDetail;
	
	@GET
	@RequestMapping("/payrole/{empId}")
	public Employee getOrderdetail(@PathVariable("empId") long empId) {
		
		return employeeDetail.getEmployeeDetails(empId);
	}
	
	@POST
	@RequestMapping("/data/payload")
	public String getDatawithPayload(@RequestBody GetdataObject getdataObject) {
		log.info(getdataObject.getName());
		return getdataObject.getName() +" "+ getdataObject.getAddress();
		
	}
/*	This GET controller give you list of supplier details for a given supplier id/name/phone/email address. */
	@GET
	public String getSupplierDetail(@QueryParam("id") String id,@QueryParam("name") String supplierName,
			@QueryParam("phoneno") String supplierPhone, @QueryParam("email") String supplierEmail) {
		return id;
	}
}
