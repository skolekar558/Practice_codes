//WAP to find maximum and minimum element from an array.

package com.array;

public class Min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {20,25,28,18,19};
int min,max=0;
max=arr[0];
min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i])
			max=arr[i];
		if(min>arr[i])
			min=arr[i];
	}System.out.println("Maximum element is :"+max);
	System.out.println("Minimum element is :"+min);

}
}