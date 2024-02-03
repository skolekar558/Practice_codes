package com.basic_programs;

//2. If the total selling price of 15 items and the total profit earned on them is input through the keyboard, 
//write a program to find the cost price of one item.
import java.util.*;

public class Calculate_cost_price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int selling_price_for_15_items = s.nextInt();
		int profit = s.nextInt();
		int cost_price = selling_price_for_15_items - profit;
		System.out.println("cost price of 15 items=" + cost_price);
		float cost_price_1 = cost_price / 15;
		System.out.println("cost price of each item=" + cost_price_1);

	}

}
