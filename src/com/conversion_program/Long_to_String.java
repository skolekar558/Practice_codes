package com.conversion_program;

import java.util.Scanner;

// Write Java program to Convert a Long to String
public class Long_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		Long l = s.nextLong();
		String str = Long.toString(l);
		System.out.println(str);
	}

}
