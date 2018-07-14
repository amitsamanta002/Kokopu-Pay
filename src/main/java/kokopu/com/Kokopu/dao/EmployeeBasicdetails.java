package kokopu.com.Kokopu.dao;


import org.slf4j.Logger;

import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import kokopu.com.Kokopu.dao.config.ConnectCassandra;
import kokopu.com.Kokopu.model.Employee;


public class EmployeeBasicdetails {
	
	private static Logger log = org.slf4j.LoggerFactory.getLogger(EmployeeBasicdetails.class);
	
	private ConnectCassandra connectCassandra = new ConnectCassandra();
	private Session session = connectCassandra.ConnectDB();
	
	public Employee getEmployeeBasicdetails(long empId) {
		
		String sql_empdeail = "select empid,empname from emp_detail where empid = ?";
		String sql_empdept = "\n" + 
				"select deptname from emp_dept where deptid = 'MFT';";
		
		log.info("Input get-request for employeee-id::: +",empId);
		PreparedStatement ps = session.prepare(sql_empdeail);
		ResultSet rs = null;
		rs = session.execute(ps.bind(empId));
		Employee emp = new Employee();
		for(Row row:rs)
		{
			emp.setEmpId(row.getLong(0));
			emp.setEmpName(row.getString(1));

		}
		
		rs=null;
		rs=session.execute(sql_empdept);
		for(Row row:rs)
		{
			emp.setEmpDept(row.getString(0));
		}
		return emp;
		
	}

}
