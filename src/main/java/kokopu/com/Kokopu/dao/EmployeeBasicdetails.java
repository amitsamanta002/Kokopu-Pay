package kokopu.com.Kokopu.dao;


import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;
import kokopu.com.Kokopu.dao.config.ConnectCassandra;
import kokopu.com.Kokopu.model.Employee;



public class EmployeeBasicdetails {
	private ConnectCassandra connectCassandra = new ConnectCassandra();
	private Session session = connectCassandra.ConnectDB();
	
	public Employee getEmployeeBasicdetails(int empId) {
		
		String sql = "select empid,empname from emp_detail where empid = 100;";
		ResultSet rs = session.execute(sql);
		Employee emp = new Employee();
		for(Row row:rs)
		{
			emp.setEmpId(row.getLong(0));
			emp.setEmpName(row.getString(1));
		}
		return emp;
		
	}

}
