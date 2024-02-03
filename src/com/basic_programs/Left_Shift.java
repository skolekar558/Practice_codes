package com.basic_programs;

// left shift operator can be used to perform multiplication by a power of 2, which is faster than using the multiplication operator (*) when working with large numbers. However, it should be used with caution as it can also lead to unexpected results when used with negative numbers.
public class Left_Shift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0xff;
		System.out.printf("before left shift: %04x\n", i);
		i = i << 3;
		System.out.printf("after left shift: %04x\n", i);
	}

}
