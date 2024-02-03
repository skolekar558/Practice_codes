package com.if_statement;

// Write a Java program that accepts three numbers and check All numbers are equal or not
import java.util.*;

public class Equal_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number 1 :");
		int n1 = s.nextInt();
		System.out.println("Enter the no 2:");
		int n2 = s.nextInt();
		System.out.println("enter the no  3:");
		int n3 = s.nextInt();
		boolean isequal = false;
		if (n1 == n2 && n1 == n3 && n2 == n3) {
			isequal = true;
		}
		if (isequal == true) {
			System.out.println("all no are equal");
		} else {
			System.out.println("all no are not equal");
		}

	}

}
