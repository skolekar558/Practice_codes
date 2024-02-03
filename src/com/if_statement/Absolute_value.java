package com.if_statement;
//absolute value of a number 

import java.util.Scanner;

public class Absolute_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first angle:");
		int n= s.nextInt();
		if(n<0 ) {
			System.out.println("Absolute value="+(n*-1));
		}
		else {
			System.out.println("Absolute value="+n);
		}
	}

}
