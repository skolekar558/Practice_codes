package com.string;
// print length of string without using length() function.
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=0;
		String s="shubhangi";
		for(char c1:s.toCharArray())
			l++;
		System.out.println("Length of String is:"+l);

	}

}
