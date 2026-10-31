package com.Looping_Statments;

import java.util.Scanner;

//2. Write a program to print all natural numbers in reverse
public class Reverse_Natural_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The number : ");
		int n = s.nextInt();
		System.out.println("Natural no between 1 to n  in reverse order:");
		for (int i = n; i >= 1; i--) {

			System.out.println(i);
		}
	}

}
