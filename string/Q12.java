//To count occurrences of character in given string.

package com.string;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="shubhangi";
char ch='h';
int cnt=0;
for(int i=0;i<str.length();i++) {
	if(str.charAt(i)==ch) {
		cnt++;
	}
}System.out.println("Occurrence of "+ch +"   "+"are"+"  "+cnt);
	}

}
