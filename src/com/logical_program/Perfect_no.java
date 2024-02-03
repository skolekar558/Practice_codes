package com.logical_program;

import java.util.*;

public class Perfect_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}

		}
		System.out.println(sum);
		if (sum == n) {
			System.out.println("Is a perfect no.");
		} else {
			System.out.println("not a perfect no.");
		}
	}

}
