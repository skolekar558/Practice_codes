package com.if_statement;
//. Write a program to check whether a number is negative, positive or zero
import java.util.*;

public class Positive_or_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = s.nextInt();
		if (n > 0) {
			System.out.println(n + "  is a positive no.");
		} else if (n == 0) {
			System.out.println(" no is Zero.");
		} else {
			System.out.println(n + " is a negative no");
		}
	}

}
