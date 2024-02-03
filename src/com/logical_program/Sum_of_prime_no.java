package com.logical_program;

public class Sum_of_prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0, c, n, i;
		for (n = 1; n <=10; n++) {
			c = 0;

			for (i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					c++;
					break;
				}
			}
			if (c == 0 && n != 1) {
				sum = sum + n;

			}
		}
		System.out.println(sum);

	}
}