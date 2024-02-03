package com.if_statement;

//. Write a program to find maximum between two numbers
import java.util.*;

public class Max_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first no:");
		int n1 = s.nextInt();
		System.out.println("enter the second no:");
		int n2 = s.nextInt();
		if (n1 > n2) {
			System.out.println("Max no =" + n1);
		} else {
			System.out.println("Max no=" + n2);
		}
	}

}
