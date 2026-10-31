//To find first occurrence of a character     in a given string.
package com.string;
import java.util.*;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String firstchar;
char ch;
int i,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string to find first char occur=");
firstchar=sc.next();
System.out.println("enter the character to find=");
ch=sc.next().charAt(0);
for( i=0;i<firstchar.length();i++) {
	if(firstchar.charAt(i)==ch) {
		flag++;
		break;
	}
}if(flag==0) {
	System.out.println("sorry not found character");}
else {
	System.out.format("the first character occurrence of %c at %d position",ch,i);
	
}
	}

}
