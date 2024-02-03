// to store element in array and print it.

package com.array;
import java.util.*;

public class Store_and_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the array size:");
int size=s.nextInt();
int a[]=new int[size];
for(int i=0;i<a.length;i++) {
	System.out.printf("enter array elements a[%d]:",i);
	a[i]=s.nextInt();
	
}
System.out.println("\nDisplay element.....\n");
for(int e:a)
System.out.println( e);
	}

}
