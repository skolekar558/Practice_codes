package com.basic_programs;

//The length & breadth of a rectangle and radius of a circle are input through the keyboard.
//Write a program to calculate the area & perimeter of the rectangle, and the area & circumference of the circle.
import java.util.*;

public class Area {
	static double pi = 3.14;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the length:");
		int l = s.nextInt();
		System.out.println("enter the breadth");
		int b = s.nextInt();
		System.out.println("radius of circle:");
		int r = s.nextInt();
		int area = l * b;
		int perimeter = 2 * (l + b);
		System.out.println("Area of rectangle =" + area);
		System.out.println("Perimeter of rectangle:" + perimeter);
		double Area_of_circle = pi * r * r;
		double circumference = 2 * pi * r;
		System.out.println("Area of circle =" + Area_of_circle);
		System.out.println(" circumference of circle=" + circumference);

	}

}
