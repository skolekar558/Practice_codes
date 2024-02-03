package com.conversion_program;

import java.util.Scanner;

//Write Java program to Convert Float to String
public class Float_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		Float f = s.nextFloat();
		String str = Float.toString(f);
		System.out.println(str);
	}

}
