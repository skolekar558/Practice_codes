package com.basic_programs;

// Two numbers are input through the keyboard into two locations C and D. Write a program to interchange the contents of C and D.
import java.util.*;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the num1:");
		int n1 = s.nextInt();
		System.out.println("enter the num2:");
		int n2 = s.nextInt();
		System.out.println("before swap n1=" + n1 + " and n2=" + n2);
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		System.out.println("After swap n1=" + n1 + " and n2=" + n2);

	}

}
