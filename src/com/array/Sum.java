//To calculate sum of a number.

package com.array;
import java.util.*;
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);  
System.out.println("enter the array size:");
int size=s.nextInt();
int[]a=new int[size];
int sum=0;
for(int i=0;i<a.length;i++) {
System.out.printf("element of array a[%d]:",i);
a[i]=s.nextInt();


sum=sum+a[i];}System.out.println(sum);
s.close();
	}

}
