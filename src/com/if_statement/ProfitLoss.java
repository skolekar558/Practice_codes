package com.if_statement;

//Write a program to calculate profit or loss
import java.util.*;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter selling price");
		int sp = s.nextInt();
		System.out.println("enter cost price");
		int cp = s.nextInt();
		if (sp > cp) {
			int profit = sp - cp;
			System.out.println("profit=" + profit);
		} else {
			int loss = cp - sp;
			System.out.println("Loss=" + loss);
		}

	}

}
