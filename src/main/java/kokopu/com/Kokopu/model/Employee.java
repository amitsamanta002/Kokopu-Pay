package kokopu.com.Kokopu.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int empId,empBankId;
	private String empName,empDept,empPanno;
	private double empSalary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpBankId() {
		return empBankId;
	}
	public void setEmpBankId(int empBankId) {
		this.empBankId = empBankId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpPanno() {
		return empPanno;
	}
	public void setEmpPanno(String empPanno) {
		this.empPanno = empPanno;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empBankId=" + empBankId + ", empName=" + empName + ", empDept=" + empDept
				+ ", empPanno=" + empPanno + ", empSalary=" + empSalary + "]";
	}

}
