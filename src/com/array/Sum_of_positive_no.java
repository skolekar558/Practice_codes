//WAP TO print sum of positive no.

package com.array;
import java.util.*;
public class Sum_of_positive_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the size:");
int l=s.nextInt();
int a[]=new int[l];
for(int i=0;i<l;i++) {
	System.out.printf("enter the array element a[%d]:",i);
	a[i]=s.nextInt();
}
int sum=0;
for(int i=0;i<l;i++) {
	if(a[i]>0) {
	sum=sum+a[i];	
	}
}System.out.println("sum of positive no"+sum);

sum=0;
for(int i=0;i<l;i++) {
	if(a[i]<0) {
	sum=sum+a[i];	
	}
}System.out.println("sum of negative no"+sum);


	}

}
