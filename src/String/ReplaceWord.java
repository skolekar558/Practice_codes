package stringAssignment;

import java.util.Scanner;

public class ReplaceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String org = sc.nextLine();
		System.out.println("Enter the word which will be replace:");
		String oldWord = sc.nextLine();
		System.out.println("Enter the word who placed after replacement");
		String newWord = sc.nextLine();
		String update = org.replace(oldWord, newWord);
		System.out.println("updated string: " + update);

	}

}
