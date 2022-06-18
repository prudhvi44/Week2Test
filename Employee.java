package com.prodapt.week2Test;

public class Employee {
	String Name;
	int age;
	String Designation;
	public Employee(String name,int Age,String  designation) {
		this.Name=name;
		this.age=Age;
		this.Designation=designation;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [Name=" + Name + ", age=" + age + ", Designation=" + Designation + "]";
	}
	

	
}
