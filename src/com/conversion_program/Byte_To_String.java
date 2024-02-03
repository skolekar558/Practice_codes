package com.conversion_program;

//Write Java program to Convert byte into the string
import java.util.*;

public class Byte_To_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter value in byte");
		byte b = s.nextByte();
		String str = Byte.toString(b);
		System.out.println(str);
	}

}
