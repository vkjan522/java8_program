package com.program;

public class Employee {
	private int eId;
	private String eName;
	private String department;
	private double eSalaray;
	public Employee() {
	}
	public Employee(int eId, String eName, String eBranch, double eSalaray) {
		this.eId = eId;
		this.eName = eName;
		this.department = eBranch;
		this.eSalaray = eSalaray;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDepartment() {
		return department;
	}
	public void seteDepartment(String eBranch) {
		this.department = eBranch;
	}
	public double geteSalaray() {
		return eSalaray;
	}
	public void seteSalaray(double eSalaray) {
		this.eSalaray = eSalaray;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [eId=");
		builder.append(eId);
		builder.append(", eName=");
		builder.append(eName);
		builder.append(", Department=");
		builder.append(department);
		builder.append(", eSalaray=");
		builder.append(eSalaray);
		builder.append("]");
		return builder.toString();
	}
	

}
