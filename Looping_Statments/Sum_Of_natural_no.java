package com.Looping_Statments;

import java.util.Scanner;

//9. Write a program to find sum of all natural numbers between 1 to n
public class Sum_Of_natural_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The number : ");
		int n = s.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.print("sum of 1 to n natural no : " + sum);
	}

}
