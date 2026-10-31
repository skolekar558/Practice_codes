package com.Looping_Statments;

import java.util.Scanner;

//10. Write a program to find sum of all even numbers between 1 to n
public class Sum_of_even_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The number : ");
		int n = s.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.print("sum of 1 to n even no : " + sum);

	}

}
