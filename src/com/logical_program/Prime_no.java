package com.logical_program;

import java.util.*;

public class Prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no:");
		int n = s.nextInt();
		boolean f = false;
		for (int i = 2; i <= n / 2; i++) // WE are looping from 2 to n/2.because no.is not divisible by more than its
											// half.
		{
			if (n % i == 0) {
				f = true;
				break;
			}

		}
		if (!f) {
			System.out.println("is a prime no");
		} else {
			System.out.println("not a prime no");
		}
	}

}
