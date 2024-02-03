package com.conversion_program;

import java.util.Scanner;

// Write Java program to Convert Double to String
public class Double_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		Double d = s.nextDouble();
		String str = Double.toString(d);
		System.out.println(str);
	}

}
