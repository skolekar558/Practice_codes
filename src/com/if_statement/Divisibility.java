package com.if_statement;

//Write a program to check whether a number is divisible by 5 and 11 or not.
import java.util.*;

public class Divisibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = s.nextInt();
		if ((n % 5 == 0) && (n % 11 == 0)) {
			System.out.println("no is divisible by 5 and 11");
		} else {
			System.out.println("no is not  divisible by 5 and 11");
		}
	}

}
