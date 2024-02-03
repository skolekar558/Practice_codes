package com.basic_programs;

//Write a program to convert a string to an integer in Java.
import java.util.Scanner;

public class String_to_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number(String):");
		String str = s.next();
		int i = Integer.parseInt(str);
		System.out.println(i);

	}

}
