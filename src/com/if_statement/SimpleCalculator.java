package com.if_statement;

//. Write a Java program to create a simple calculator
import java.util.*;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter first number ");
		int n1 = s.nextInt();
		System.out.println("enter second number ");
		int n2 = s.nextInt();

		System.out.println("Enter the operation(1.+ ,2.- , 3.*, 4./,5.%)");
		int choice = s.nextInt();
		if (choice == 1) {
			System.out.println("Addition is=" + (n1 + n2));
		} else if (choice == 2) {
			System.out.println("substraction is=" + (n1 - n2));
		} else if (choice == 3) {
			System.out.println("Multiplication is=" + (n1 * n2));
		} else if (choice == 4) {
			System.out.println("Division is=" + (n1 / n2));
		} else if (choice == 5) {
			System.out.println("Modulus is=" + (n1 % n2));
		}
	}

}
