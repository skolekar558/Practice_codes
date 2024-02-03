package com.basic_programs;

//Write Java program to how to accept Userinput from keyboard.
///*nextLine() method of scanner class which takes userinput from keyboard */ 
import java.util.*;

public class User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String str = s.nextLine();
		System.out.println("string is  " + str);
	}

}
