package stringAssignment;

import java.util.Scanner;

public class ValidateMobNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the mobile no:");
		Scanner sc = new Scanner(System.in);
		String mNo = sc.nextLine();
		boolean isValid = mNo.matches("\\d{10}");
		if (isValid) {
			System.out.println("MobileNo is valid:");
		} else {
			System.out.println("MobileNo is not valid");
		}
	}

}
