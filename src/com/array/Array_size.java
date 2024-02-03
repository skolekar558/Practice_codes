
//WAP in to array size to be user input print it.
package com.array;
import java.util.*;
public class Array_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter the array size:");
int size=s.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++) {
	System.out.printf("Element of arr[%d]: ", i);
	arr[i]=s.nextInt();
	
}System.out.println("\nDisplay Array Elements......\n");
for(int e:arr) {
	System.out.println(e);
}
	}

}
