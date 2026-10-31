// To search all occurrences of character in given string.

package com.string;
import java.util.*;
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str;
char ch;
int i=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the string =");
str=sc.next();
System.out.println("enter the character to find =");
ch=sc.next().charAt(0);
while(i<str.length()) {
	if(str.charAt(i)==ch) {
		System.out.format("\n %c Found position %d ",ch,i+1);
	}i++;
}
	}

}
