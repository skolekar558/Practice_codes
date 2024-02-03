package com.basic_programs;
//Write Java program to Calculate Area of a Circle.
import java.util.*;
public class Area_of_circle {
	static double pi=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the radius:");
		int r=s.nextInt();
		double Area_of_circle=pi*r*r;
		System.out.println("Area of circle:"+Area_of_circle);
	}

}
