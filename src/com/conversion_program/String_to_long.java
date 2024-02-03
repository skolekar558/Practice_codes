package com.conversion_program;

//. Write Java program to Convert String to Long.
import java.util.Scanner;

public class String_to_long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string(long value)");
		String str = s.next();
		Long l = Long.valueOf(str).longValue();
		System.out.println("Long value using ValueOf()method:" + l);
		l = Long.parseLong(str);
		System.out.println("Long value using parseLong() method:" + l);
	}

}
