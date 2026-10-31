package stringAssignment;

import java.util.Scanner;

public class HighestFrequencyOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Assuming input consists of ASCII characters
        int[] frequency = new int[256]; // Array to store frequency of each character

        // Count frequency of each character
        for (char c : input.toCharArray()) {
            frequency[c]++;
        }

        // Find the character with the highest frequency
        char maxChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                maxChar = (char) i;
            }
        }

        System.out.println("Highest frequency character: " + maxChar + " (Frequency: " + maxCount + ")");
    
	}

}
