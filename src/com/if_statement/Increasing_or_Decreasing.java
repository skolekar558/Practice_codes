package com.if_statement;

// Write a java program that accepts three numbers from the user and check if numbers are in "increasing" or "decreasing" order
import java.util.*;

public class Increasing_or_Decreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter first no:");
		int n1 = s.nextInt();
		System.out.println("enter first no:");
		int n2 = s.nextInt();
		System.out.println("enter first no:");
		int n3 = s.nextInt();
		if (n1 < n2 && n2 < n3) {
			System.out.println("no are in increasing order");
		} else if (n1 > n2 && n2 > n3) {
			System.out.println("no are in decreasing order");
		} else {
			System.out.println("neigther  increasing nor decreasing order");
		}

	}

}
