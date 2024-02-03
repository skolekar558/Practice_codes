package com.basic_programs;

import java.util.*;

public class Reverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no:");
		int n = s.nextInt();
		int rev = 0;
		while (n > 0) {

			int digit = n % 10;
			n = n / 10;

			rev = rev * 10 + digit;
		}
		System.out.println(rev);

	}

}
