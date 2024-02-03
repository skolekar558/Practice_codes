package com.basic_programs;

//Ramesh's basic salary is input through the keyboard. His dearness allowance is 40% of basic salary, 
//and house rent allowance is 20% of basic salary. Write a program to calculate his gross salary.
import java.util.*;

public class Gross_Salary {
	static int emp_id;
	static String emp_name;
	static float basic_salary;
	static double dallowance;
	static double house_rent;
	static double gross_salary;

	public static void calculate_grosssalary() {
		dallowance = 0.4 * basic_salary;
		house_rent = 0.2 * basic_salary;
		gross_salary = basic_salary + dallowance + house_rent;
		System.out.println(" basic_salary=" + basic_salary);
		System.out.println("dallowance=" + dallowance);
		System.out.println("house_rent=" + house_rent);
		System.out.println("gross_salary=" + gross_salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter employee id:");
		emp_id = s.nextInt();
		System.out.println("enter employee name:");
		emp_name = s.next();
		System.out.println("Enter the basic salary");
		basic_salary = s.nextFloat();
		calculate_grosssalary();

	}

}
