package com.conversion_program;

//Write Java program to Convert String to Integer
import java.util.*;

public class String_to_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string(integer value)");
		String str = s.next();
		int i = Integer.valueOf(str).intValue();
		System.out.println("Integer value using valueOf()method " + i);
		i = Integer.parseInt(str);
		System.out.println("Integer value using parseInt()method " + i);

	}

}
