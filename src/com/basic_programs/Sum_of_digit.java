package com.basic_programs;

// If a five-digit number is input through the keyboard, write a program to calculate the sum of its digits. ( Hint: Use the modulus operator '%')
import java.util.*;

public class Sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			sum = sum + digit;
		}
		System.out.println("Sum of digit=" + sum);
	}

}
