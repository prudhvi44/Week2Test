package com.prodapt.week2Test;

public class Tester1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Detiles ......\n");
		HR_Manager obj = new HR_Manager("Prudhvi", 22, "Developer");
		HR_Manager obj1 = new HR_Manager("Krishna", 26, "Team Leader");
		HR_Manager obj2 = new HR_Manager("Akshay N", 30, "Manager");
		HR_Manager obj3 = new HR_Manager("Pavan", 26, "Web Developer");
		HR_Manager obj4 = new HR_Manager("Lokesh", 24, "AI&ML");

		obj.process_Records(obj);
		obj.process_Records(obj1);
		obj.process_Records(obj2);
		obj.process_Records(obj3);
		obj.process_Records(obj4);
		}



		}


