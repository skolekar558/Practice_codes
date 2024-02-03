package com.basic_programs;

// Write Java program to Convert string to Boolean
// Boolean constructor can also take a boolean value as a parameter and return a Boolean object that represents the same value.
//Additionally, the String class provides a static method valueOf that can be used to convert a string to a boolean value, which returns a primitive boolean rather than a Boolean object.
import java.util.*;

public class String_to_boolean {
	static boolean b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("enter the string(boolean)");
		String str = s.next();
		// 1.by creating object of boolean class.
		boolean b1 = new Boolean(str);
		System.out.println(b1);
		// 2.using String method.
		System.out.println(str.valueOf(b));

	}

}
