package com.basic_programs;
//The distance between two cities (in km.) 

//is input through the keyboard. Write a program to convert and print this distance in meters, feet, inches and centimeters.

import java.util.*;

public class Distance {
	static float distance;
	static double meters, feet, inches, centimeters;

	public static void km_to_m() {
		meters = distance * 1000;
		feet = distance * 3281;
		inches = distance * 39370.1;
		centimeters = distance * 100000;
		System.out.println("meter=" + meters);
		System.out.println("feet=" + feet);
		System.out.println("inches=" + inches);
		System.out.println("centimeters=" + centimeters);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the distance in km");
		distance = s.nextFloat();
		km_to_m();
	}

}
