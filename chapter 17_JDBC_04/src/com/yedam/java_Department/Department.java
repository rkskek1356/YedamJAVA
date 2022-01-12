package com.yedam.java_Department;

public class Department {
	private int departmentId;
	private String departmentName;
	private String managerId;
	private int locationId;
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	@Override
	public String toString() {
		return "부서번호 > " + departmentId + "\n부서이름 > " + departmentName + "\n매니저번호 > "
				+ managerId + "\n지역번호 > " + locationId + "\n";
	}
	
	
}
