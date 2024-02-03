package com.if_statement;

// Write a program to check whether a character is uppercase or lowercase alphabet
import java.util.*;

public class Uppercase_or_Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter character");
		char ch = s.next().charAt(0);
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("character in Uppercase");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("character in lowercase");

		}
	}
}
