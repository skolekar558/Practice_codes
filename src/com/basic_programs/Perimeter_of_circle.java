package com.basic_programs;
//Write Java program to Calculate Perimeter of a Circle
import java.util.*;
public class Perimeter_of_circle {
static double pi=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the radius:");
int r=s.nextInt();
double perimeter=2*pi*r;
System.out.println("perimeter of circle:"+perimeter);
	}

}
