package com.basic_programs;
//. Write Java program to Swap two numbers using bitwise operator.

// The XOR operator works by comparing the corresponding bits of two numbers and returning a 1 if the bits are different, and a 0 if they are the same.

import java.util.Scanner;

public class Swap_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num1 and num2");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		System.out.println("before swapping:n1=" + n1 + " and  " + "n2=" + n2);
		n1 = n1 ^ n2; // num1 now stores the XOR result of num1 and num2
		n2 = n1 ^ n2;// num2 now stores the original value of num1
		n1 = n1 ^ n2;// num1 now stores the original value of num2
		System.out.println("after swapping:n1=" + n1 + " and " + "n2=" + n2);

	}

}
