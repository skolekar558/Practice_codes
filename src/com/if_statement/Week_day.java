package com.if_statement;

//Write a program to input week number and print week day
import java.util.*;

public class Week_day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter week  day number(1-7)");
		int n = s.nextInt();
		if (n == 1) {
			System.out.println("Sunday");
		}
		if (n == 2) {
			System.out.println("Monday");
		}
		if (n == 3) {
			System.out.println("Tuesday");
		}
		if (n == 4) {
			System.out.println("Wenesday");
		}
		if (n == 5) {
			System.out.println("Thursday");
		}
		if (n == 6) {
			System.out.println("Friday");
		}
		if (n == 7) {
			System.out.println("Saturday");
		}
	}

}
