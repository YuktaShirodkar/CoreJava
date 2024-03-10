package com.edubridge.homeassigment.inheritence;

public class Student1 {

	int rollno;
	String name,address;
	public Student1(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
