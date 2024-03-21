package com.code;

public class Employee {

	private int eid;
	private String ename;
	private String edepartment;
	private float esalary;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, String edepartment, float esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edepartment = edepartment;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdepartment() {
		return edepartment;
	}

	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", edepartment=" + edepartment + ", esalary=" + esalary
				+ "]";
	}

}
