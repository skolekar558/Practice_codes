package arrayList;

import java.util.ArrayList;

//Create arraylist of 10 integers. Insert an element at 7th position.
public class ListOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		System.out.println(numbers);
		numbers.add(6, 99);
		System.out.println(numbers);
	}

}
