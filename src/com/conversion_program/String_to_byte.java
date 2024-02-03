package com.conversion_program;
//Write Java program to Convert string to byte
import java.util.*;

public class String_to_byte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.next();
		byte b = Byte.valueOf(str).byteValue();
		System.out.println("Byte value Using byteValue() Method " + b);
		b = Byte.parseByte(str);
		System.out.println("Byte value Using parseByte() Method " + b);

	}

}
