
package com.logical_program;

import java.util.*;
  
public class Factorial_of_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no:");
		int n = s.nextInt();
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;

		}
		System.out.println(f);
	}

}
