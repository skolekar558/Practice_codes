package String;

import java.util.ArrayList;

//How to remove all duplicates from a given string?

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java";
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '$';
				}
			}

		}
		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] != '$') {
				list.add(ch[i]);
			}

		}
		System.out.println(list);

	}

}
