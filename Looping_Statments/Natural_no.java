package com.Looping_Statments;

//1. Write a program to print all natural numbers from 1 to n
import java.util.Scanner;

public class Natural_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The number : ");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Natural no between 1 to n :" + i);
		}
	}

}
