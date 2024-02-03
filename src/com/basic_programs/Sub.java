package com.basic_programs;
//Write Java program to Perform subtraction without using minus (-) operator
import java.util.*;
public class Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter num1");
int n1=s.nextInt();
System.out.println("enter num2");
int n2=s.nextInt();
System.out.println(Math.subtractExact(n1, n2));
	}

}
