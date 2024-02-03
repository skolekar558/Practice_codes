package com.if_statement;

import java.util.Scanner;

// If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three
public class youngest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the age of ram");
		int a_ram = s.nextInt();
		System.out.println("Enter the age of shyam");
		int a_shyam = s.nextInt();
		System.out.println("Enter the age of ajay");
		int a_ajay = s.nextInt();
		if (a_ram < a_shyam && a_ram < a_ajay)
			System.out.print("The Youngest Age is Ram");
		else if (a_shyam < a_ram && a_shyam < a_ajay)
			System.out.print("The Youngest Age is Shyam");
		else
			System.out.print("The Youngest Age is Ajay");
	}
}
