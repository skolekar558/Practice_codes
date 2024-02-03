package com.if_statement;
// Write a program to check whether the triangle is equilateral, isosceles or scalene triangle
import java.util.*;

public class TriangleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the  first angle ");
		int a1 = s.nextInt();
		System.out.println("enter the  second angle ");
		int a2 = s.nextInt();
		System.out.println("enter the  third angle ");
		int a3 = s.nextInt();
		if (a1 == a2 && a2 == a3) {
			System.out.println("triangle is equilateral ");
		} else if (a2 == a3) {
			System.out.println("triangle is Isosceles ");
		} else if(a1!=a2 && a2!=a3 ){
			System.out.println("triangle is scalen ");
		}
	}
}