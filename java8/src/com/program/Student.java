package com.program;

public class Student {
	private int roll;
	private String sName;
	private String branch;
	public Student(int roll, String sName, String branch) {
		this.roll = roll;
		this.sName = sName;
		this.branch = branch;
	}
	public Student() {
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "(roll=" + roll + ", sName=" + sName + ", branch=" + branch + ")";
	}
}
