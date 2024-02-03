package com.basic_programs;

//Write Java program to demonstrate the example of the right shift (>>) operator.
//right shift operator can be used to perform division by a power of 2, which is faster than using the division operator (/) when working with large numbers. However, it should be used with caution as it can also lead to unexpected results when used with negative numbers.
public class Right_Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0xff;
		System.out.printf("before right shift  :%04X\n", i);
		i = (i >> 3);
		System.out.printf("after right shift: %04X\n", i);
	}

}
