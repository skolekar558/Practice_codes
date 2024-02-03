package com.conversion_program;

//. Write Java program to Convert a short integer into a string
import java.util.*;

public class Short_To_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter short value");
		Short sh = s.nextShort();
		System.out.println("String value for short=" + Short.toString(sh));
	}

}
