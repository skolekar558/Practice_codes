package com.if_statement;

// Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
//Calculate percentage and grade according to following:
import java.util.*;

public class Calculateper {
	static int stud_id, sub1, sub2, sub3, sub4, sub5;
	static String name;
	static double per;

	public static void calculateper() {
		per = (sub1 + sub2 + sub3 + sub4 + sub5) * 100 / 500;
		System.out.println("percentage=" + per);
	}

	public static void calculategrade() {
		if (per >= 90) {
			System.out.println("A");
		} else if (per >= 80) {
			System.out.println("B");
		} else if (per >= 70) {
			System.out.println("C");
		} else if (per >= 60) {
			System.out.println("D");
		} else if (per >= 50) {
			System.out.println("E");
		} else if (per >= 40) {
			System.out.println("F");
		} else {
			System.out.println("Fail");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the roll_no:");
		stud_id = s.nextInt();
		System.out.println("enter name:");
		name = s.next();
		System.out.println("Enter subject 1:");
		sub1 = s.nextInt();
		System.out.println("Enter subject 2:");
		sub2 = s.nextInt();
		System.out.println("Enter subject 3:");
		sub3 = s.nextInt();
		System.out.println("Enter subject 4:");
		sub4 = s.nextInt();
		System.out.println("Enter subject 5:");
		sub5 = s.nextInt();
		calculateper();
		calculategrade();
	}

}
