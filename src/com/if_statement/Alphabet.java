package com.if_statement;

//Write a program to check whether a character is alphabet or not
import java.util.*;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter character :");
		char ch = s.next().charAt(0);
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println("Is a character");
		} else {
			System.out.println("not a character");
		}
	}

}
