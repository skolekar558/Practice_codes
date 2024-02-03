package com.logical_program;

public class NO_is_print {
public static void main(String[]args) {
	
	for(int i=1;i<=100;i++) {
		if(i%9==0) {
			System.out.println("hello");
		}
		else if(i%3==0) {
			System.out.println("hi");
		}
		else {
			System.out.println(i);
		}
	}
}
}
