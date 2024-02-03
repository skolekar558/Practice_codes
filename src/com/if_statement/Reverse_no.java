package com.if_statement;

import java.util.Scanner;

//A five-digit number is entered through the keyboard. 
//Write a program to obtain the reversed number and to determine whether the original and reversed numbers are equal or not

public class Reverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter five digit no");
		int n = s.nextInt();
		int rev = n;
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			sum = (sum * 10) + digit;
		}
		System.out.println(sum);
		if (sum == rev) {
			System.out.println("sum is equal to reverse no");
		} else {
			System.out.println("sum is  not equal to reverse no");
		}

	}

}
