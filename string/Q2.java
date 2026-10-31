package com.string;
//"=="method used to check reference of string.
//By using new keyword  different reference is created for equal string.
//without using new keyword reference is same for equal string.
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="shubhangi";
String str2="shubhra";
System.out.println((str1==str2));


String s=new String("shubhangi");
String s1=new String("shubhangi");
System.out.println((s==s1));

String s2="shubhangi";
String s3="shubhangi";
System.out.println((s2==s3));


String s4="shubhangi";
String s5= s4;
System.out.println((s4==s5));


String s6="shubhangi";
String s7=new String("shubhangi");
System.out.println((s6==s7));


// by using "equals" method.
//equal method compare content of string. so that by using new keyword also gives true result.
String str3="shubhangi";
String str4="shubhra";
System.out.println(str3.equals(str4));


String str5="shubhangi";
String str6=new String("shubhangi");
System.out.println(str5.equals(str6));


String s8="shubh";
String s9=null;
System.out.println(s8.equals(s9));

	}

}
