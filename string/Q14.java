// To count total number of word in a given string.
package com.string;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String msg="java is a platform-independant.";
System.out.println("given string is :"+msg);
int total=1;
int i=0;
while(i<msg.length()) {
	if((msg.charAt(i)==' ')&&(msg.charAt(i+1)!=' ')) {
		total++;
	}i++;
}System.out.println("no.of words in string:"+total);
	}

}
