package com.basic_programs;

//Write Java program to Extract Numbers from the string.
import java.util.*;

public class Extract_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String str = s.next();
		String num = str.replaceAll("[^0-9]", "");// extracting string

		System.out.println(num);
	}

}
