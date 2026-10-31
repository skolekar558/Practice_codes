package com.Looping_Statments;

//7. Write a program to print all even numbers between 1 to 100
public class Even_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even no between 1 to 100 are: ");
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
