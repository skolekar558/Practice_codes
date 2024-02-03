package com.conversion_program;

//Write Java program to Convert an Integer to String
import java.util.*;

public class Int_to_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int i = s.nextInt();
		String str = Integer.toString(i);
		System.out.println(str);
	}

}
