package com.conversion_program;

//Write Java program to Convert String to Float
import java.util.*;

public class String_to_float {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string (float value)");
		String str = s.next();
		float f = Float.valueOf(str).floatValue();
		System.out.println("float value Using floatValue() Method :  " + f);
		f = Float.parseFloat(str);
		System.out.println("float value Using parseFloat() Method : " + f);
	}

}
