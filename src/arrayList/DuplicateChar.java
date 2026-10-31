package arrayList;

import java.util.ArrayList;

/*Create arraylist of characters. Remove duplicate characters from the list. E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}Output should be {‘d’ , ‘g’ , ‘h’} */
public class DuplicateChar {

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
		System.out.println(charList);
		for (int i = 0; i < charList.size(); i++) {
			for (int j = i + 1; j < charList.size(); j++) {
				if (charList.get(i) == charList.get(j)) {
					charList.remove(j);
					j--;
				}
			}
		}
		System.out.println("After removing duplicate elements:" + charList);
	}

}
