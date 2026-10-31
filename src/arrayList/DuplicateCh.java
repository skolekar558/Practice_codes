package arrayList;

import java.util.ArrayList;

public class DuplicateCh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Character> charList = new ArrayList<>();
	        charList.add('d');
	        charList.add('g');
	        charList.add('h');
	        charList.add('d');
	        charList.add('d');
	        charList.add('h');
	        charList.add('g');

	        System.out.println("Original list: " + charList);

	        // Create a new list to store unique characters
	        ArrayList<Character> uniqueList = new ArrayList<>();

	        // Iterate through the original list
	        for (Character ch : charList) {
	            // Check if the character is already in the unique list
	            if (!uniqueList.contains(ch)) {
	                uniqueList.add(ch); // Add unique character to the new list
	            }
	        }

	        // Replace the original list with the unique list
	        charList = uniqueList;

	        // Print the modified list
	        System.out.println("List after removing duplicates: " + charList);
	}

}
