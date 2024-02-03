package com.basic_programs;

// Write Java program to Calculate EMI
import java.util.*;

public class Calculate_EMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double pri, rate, time, emi;
		System.out.print("Enter the Principal : ");
		pri = input.nextFloat();
		System.out.print("Enter the Rate : ");
		rate = input.nextFloat();
		System.out.print("Enter Time in Year : ");
		time = input.nextFloat();

		rate = rate / (12 * 100); // one month interest
		time = time * 12; // one month period
		emi = (pri * rate * Math.pow(1 + rate, time)) / (Math.pow(1 + rate, time) - 1);

		System.out.print("Monthly EMI is : " + emi + "\n");

	}

}
