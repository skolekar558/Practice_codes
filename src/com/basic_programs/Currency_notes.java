
package com.basic_programs;

//A cashier has currency notes of denominations 10, 50 and 100. If the amount to be withdrawn is input through the keyboard in hundreds, find the total number of currency notes of each denomination the cashier will have to give to the withdrawer.

import java.util.*;
public class Currency_notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the currency:");
int amt=s.nextInt();
int hundred=amt/100;
amt=amt%100;
int fifty=amt/50;
amt=amt%50;
int ten=amt/10;
amt=amt%10;
System.out.println("100 notes="+hundred);
System.out.println("50 notes="+fifty);
System.out.println("ten notes="+ten);


	}

}
