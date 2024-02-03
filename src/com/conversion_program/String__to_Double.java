package com.conversion_program;

// Write Java program to Convert String to Double
import java.util.*;

public class String__to_Double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string(double value):");
		String str = s.next();
		Double d = Double.valueOf(str).doubleValue();
		System.out.println("Double value using valueOf()method " + d);
		d = Double.parseDouble(str);
		System.out.println("Double value using parseDouble()method " + d);
	}

}
