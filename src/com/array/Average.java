
//to calculate average of a no.
package com.array;
import java.util.*;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the array size:");
int size=s.nextInt();
int a[]=new int[size];
int sum=0;int avg=0;
for(int i=0;i<a.length;i++) {
	System.out.printf("enter array element a[%d]:",i);
	a[i]=s.nextInt();
	sum=sum+a[i];
	avg=sum/size;
}System.out.println(avg);
s.close();
	}

}
