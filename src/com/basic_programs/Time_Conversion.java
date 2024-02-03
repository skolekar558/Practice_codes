package com.basic_programs;

//Write a program to convert seconds to hour, minute and seconds
import java.util.*;

public class Time_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter time in second:");
		int se = s.nextInt();
		int sec = se % 60;
		int hour = se / 60;
		int min = hour % 60;
		hour = hour / 60;
		System.out.println(hour + ":" + min + ":" + sec);

	}

}
