package com.Looping_Statments;

//8. Write a program to print all odd number between 1 to 100
public class Odd_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Odd no between 1 to 100 are: ");
		for (int i = 0; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

}
