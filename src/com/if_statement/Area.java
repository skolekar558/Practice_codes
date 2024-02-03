package com.if_statement;

import java.util.Scanner;

// Given the length and breadth of a rectangle, write a program to find whether the area of the rectangle is greater than its perimeter. 
//For example, the area of the rectangle with length = 5 and breadth = 4 is greater than its perimeter
public class Area {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);	// TODO Auto-generated method stub
System.out.println("Enter the length of rectangle:");
int l=s.nextInt();
System.out.println("Enter the breadth of rectangle:");
int b=s.nextInt();
int Area=l*b;
System.out.println("Area of rectangle:"+Area);
int perimeter=2*(l+b);
System.out.println("Perimeter of rectangle:"+perimeter);
if(Area>perimeter) {
	System.out.println("area of the rectangle is greater than its perimeter");
}else {
	System.out.println("area of the rectangle is less than its perimeter");
}

	}

}
