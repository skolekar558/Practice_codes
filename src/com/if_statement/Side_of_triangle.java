package com.if_statement;

//Write a program to input all sides of a triangle and check whether triangle is valid or not
import java.util.Scanner;

public class Side_of_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the three sides");
		int s1 = s.nextInt();
		int s2 = s.nextInt();
		int s3 = s.nextInt();
		if ((s1 + s2) >s3)
			if ((s1 + s3 )>s2)
				if ((s2 + s3 )>s1)
					System.out.println("triangle is valid");
				else
					System.out.println("triangle is not valid:");

			else
				System.out.println("triangle is not valid:");
		else
			System.out.println("triangle is not valid:");

	}

}
