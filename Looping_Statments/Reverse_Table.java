package com.Looping_Statments;

import java.util.Scanner;

//4. Write a program to print reverse tables
public class Reverse_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The number : ");
		int n = s.nextInt();
		for (int i = 10; i >= 1; i--) {
			System.out.println(n * i);
		}
	}

}
