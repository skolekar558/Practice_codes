package com.if_statement;
//Write a program to input any character and check whether it is alphabet, digit or special character

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = s.next().charAt(0);
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + "  : it is a character");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + "  : is a digit");
		} else {
			System.out.println(ch + "  : is a special character");
		}
	}

}
