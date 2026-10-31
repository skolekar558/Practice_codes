package com.Looping_Statments;
//3. Write a program to print tables
import java.util.Scanner;

public class Table_Of_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter The number : ");
		int n = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "x" + i + "=" + n * i);
		}
	}

}
