package com.if_statement;

import java.util.Scanner;

//. Write a program to check whether a triangle is valid or not, when the three angles of the triangle are entered through the keyboard.
//A triangle is valid if the sum of all the three angles is equal to 180 degrees
public class Triangle_Angle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first angle:");
		int a1 = s.nextInt();
		System.out.println("Enter second angle:");
		int a2 = s.nextInt();
		System.out.println("Enter third angle:");
		int a3 = s.nextInt();
		int sum = a1 + a2 + a3;
		System.out.println("sum =" + sum);
		if (sum == 180) {
			System.out.println("Triangle is valid");
		} else {
			System.out.println("triangle is not valid");
		}

	}

}
