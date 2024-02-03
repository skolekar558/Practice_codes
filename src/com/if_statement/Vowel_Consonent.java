package com.if_statement;

import java.util.*;

//Write a program to input any alphabet and check whether it is vowel or consonant
public class Vowel_Consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = s.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println(ch + "  : is a vowel ");
		} else
			System.out.println(ch + "  : is a consonent ");

	}

}
