/*convert string lowercase to uppercase..
To convert a lowercase alphabet to uppercase :we can substract 32 from lowercase alphabet's ASCII code to make it an uppercase alphabet
(becaus the diff. between lowercase ASCII to uppercase ASCII is 32).
package com.string;*/

package com.string;
public class Q8 {
	static String LowerToUpper(String s) {
		String result="";
		char ch=' ';
		for(int i=0;i<s.length();i++) { 
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				ch=(char)(s.charAt(i)-32);
			}
			else {
				ch=(char)(s.charAt(i));
			}result+=ch;
			
		}return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(LowerToUpper("shubhangi"));
	}

}
