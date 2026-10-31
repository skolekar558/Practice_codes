package com.string;
import java.util.*;
public class Q9 {
	public void copyString() {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s2=sc.next();
		s=s2;
		System.out.println("original string:"+s2);
		System.out.println("copy string:"+s);
		
		
	}

	
	// Using string_buffer_class
	public void copyString_using_stringbuffer() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str2=sc.next();
	StringBuffer str=new StringBuffer(str2);
	System.out.println("original string:"+str2);
	System.out.println("copy string:"+str);
	}
	
	// copystring using Valueof()method in java.
	
	public void copyStringusing_valueof() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String strorg=sc.next();
		String strcopy=String.valueOf(strorg);
		System.out.println("original String:"+strorg);
		System.out.println("copy string:"+strcopy);
	}
	//copystring using copystring using copyValueof()
public void copystring_using_copyvalueof()	
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s3=sc.next();
	String s4=String.copyValueOf(s3.toCharArray());
	System.out.println("original string:"+s3);
	System.out.println("copy string:"+s4);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q9 q =new Q9();
		
		q.copyString();
		q.copyString_using_stringbuffer();
		q.copyStringusing_valueof();
		q.copystring_using_copyvalueof(); 
	}
  
}
