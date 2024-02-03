package com.if_statement;
//Write a program to input angles of a triangle and check whether triangle is valid or not*;
import java.util.*;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter first angle of traingle");
int a1=s.nextInt();
System.out.println("enter second angle of traingle");
int a2=s.nextInt();
System.out.println("enter third angle  of traingle");
int a3=s.nextInt();
int sum=0;
if(a1>0 && a2>0 && a3>0) {
	sum=a1+a2+a3;
	if(sum==180) {
		System.out.println("it is an valid traingle");
	}
	else {
		System.out.println("not an valid triangle");}
}
	}

}
