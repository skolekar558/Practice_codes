package com.if_statement;

import java.util.*;
//Write a program to find maximum between three numbers
public class Max_between_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first no:");
		int n1 = s.nextInt();
		System.out.println("enter the second no:");
		int n2 = s.nextInt();
		System.out.println("enter the third no:");
		int n3 = s.nextInt();
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("Max no =" + n1);
			}
		} else if (n2 > n3) {
			System.out.println("Max no =" + n2);
		} else {
			System.out.println("Max no =" + n3);
		}
	}

}
