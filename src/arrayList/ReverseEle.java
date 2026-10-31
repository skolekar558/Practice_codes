package arrayList;

import java.util.Scanner;

public class ReverseEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		
		char ch[]=str.toCharArray();
		String nstr="";
		for(int i=0;i<ch.length;i++) {
			nstr+=ch[i];
			System.out.println(nstr);
		}
		
		
	}

}
