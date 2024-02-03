package com.basic_programs;

//If a four-digit number is input through the keyboard, write a program to obtain the sum of the first and last digit of this number.
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int rem, sum = 0;
		rem = num % 10;
		num = num / 1000;
		sum = sum + rem;

		rem = num % 10;
		sum = sum + rem;
		System.out.println("Sum of First Last Digits :" + sum);

	}

}
