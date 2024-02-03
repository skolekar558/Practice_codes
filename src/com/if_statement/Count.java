package com.if_statement;

//Write a Java program that reads an positive integer and count the number of digits
import java.util.*;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the positive integer");
		int n = s.nextInt();
		int sum = 0;
		while (n > 0) {

			int digit = n % 10;
			n = n / 10;
			sum = sum + digit;

		}
		System.out.println(sum);

	}
}