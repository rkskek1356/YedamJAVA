package com.yedam.java.App_Emp13;

public class Emp13 {
	private int employeeId;
	private String firstName;
	private String jobId;
	private int salary;
	private String commissionPct;
	private String departmentName;
	private int locationId;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public String getCommissionPct() {
		return commissionPct;
	}
	public void setCommissionPct(String commissionPct) {
		this.commissionPct = commissionPct;
	}
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	@Override
	public String toString() {
		return "사번 > " + employeeId + "\n이름 > " + firstName + "\n직종 > " + jobId + "\n연봉 > "
				+ salary + "\n상여 > " + commissionPct + "\n부서이름 > " + departmentName + "\n지역번호 > "
				+ locationId +"\n";
	}
	

}
