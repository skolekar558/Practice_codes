package com.if_statement;
//Write a program to check whether a year is leap year or not
import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the year:");
		int y = s.nextInt();
		if ((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0)) {
			System.out.println(" is Leap year");
		} else
			System.out.println("not a Leap year");
	}

}
