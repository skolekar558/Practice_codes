//To trim leading white spaces characters in a string. 

package com.string;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="   This is an example     ";
char[]arr=str.toCharArray();
String temp="";
for(char c:arr) {
	if(c!=' ') {
		temp+=c;
	}
}str=temp;
System.out.println(str);
	}

}
