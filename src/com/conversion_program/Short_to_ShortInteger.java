package com.conversion_program;

// Write Java program to Convert string into a short integer
import java.util.*;

public class Short_to_ShortInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.next();
		short s_val = Short.valueOf(str).shortValue();
		System.out.println("shortvalue using short value method " + s_val);
		s_val = Short.parseShort(str);
		System.out.println("short value using parseshort method" + s_val);
	}

}
