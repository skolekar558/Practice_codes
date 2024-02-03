package com.basic_programs;
//If a five-digit number is input through the keyboard, write a program to print a new number by adding one to each of its digits. For example, if the number that is input is 12391 then the output should be displayed as 23402.
import java.util.*;
public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the no");
int n=s.nextInt();
int a,sum=0;
a=(n/10000)+1;
n=n%10000;
sum=sum+(a*10000);

a=(n/1000)+1;
n=n%1000;
sum=sum+(a*1000);

a=(n/100)+1;
n=n%100;
sum=sum+(a*100);

a=(n/10)+1;
n=n%10;
sum=sum+(a*10);

a=n+1;
sum=sum+a;

System.out.println(sum);

}
}