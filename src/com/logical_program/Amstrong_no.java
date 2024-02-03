package com.logical_program;

import java.util.*;

public class Amstrong_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = n;
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			n = n / 10;
			sum = sum + (digit * digit * digit);
		}
		if (temp == sum) {
			System.out.println(temp + "    is a Amstrong no:");

		} else {
			System.out.println("not a amstrong no:");
		}
	}

}
