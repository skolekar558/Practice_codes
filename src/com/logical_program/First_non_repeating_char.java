package com.logical_program;

public class First_non_repeating_char {
	
	public static void main(String[]args) {
		String s="PeterPen";
		for(int i=0;i<s.length();i++) {
			boolean u=true;
			for(int j=0;j<s.length();j++) {
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					u=false;
					break;
				}
			}
			if(u) {
				System.out.println("The first non repeating character in string is:"+s.charAt(i));
				break;
			}
		}
	}
}

