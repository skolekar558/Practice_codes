package com.if_statement;

import java.util.Scanner;

// Write a Java program to check whether the given integer is a multiple of 5
public class Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number ");
		int n = s.nextInt();

		if (n % 5 == 0) {
			System.out.println("Multiple of five:" + n);
		} else
			System.out.println("not a multiple of five");
	}

}
