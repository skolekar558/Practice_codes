package com.basic_programs;
//Temperature of a city in Fahrenheit degrees is input through the keyboard. 
//Write a program to convert this temperature into Centigrade degrees.
import java.util.*;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the temperature in farenheit: ");
float fahrenheit=s.nextFloat();
float centigrade=(fahrenheit-32)*5/9;
System.out.println(" Temperature in fahrenheit="+fahrenheit);
System.out.println("Temperature in centigrade= "+centigrade);
	}

}
