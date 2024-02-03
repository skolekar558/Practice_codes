package String;
//How to find the maximum occurring character in a given String?

public class Max_occuring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java";
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = str.length() - 1; j > 0; j--) {
				if (str.charAt(i) == str.charAt(j) && i > j) {
					c++;
					System.out.println(str.charAt(i));
				}
			}
		}

	}

}
