package com.if_statement;

// Write a program to check whether a number is even or odd
import java.util.*;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = s.nextInt();
		if (n % 2 == 0) {
			System.out.println(n + " is an Even no.");
		} else
			System.out.println(n + " is a Odd no.");
	}

}
