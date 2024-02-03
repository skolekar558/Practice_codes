package com.logical_program;

public class Fibnoacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=0,n1=1,n3;
System.out.println(n);
System.out.println(n1);
for(int i=1;i<10;i++) {
	
	
	n3=n+n1;
	n=n1;
	n1=n3;
	
	System.out.println(n3);
	
}

	}

}
