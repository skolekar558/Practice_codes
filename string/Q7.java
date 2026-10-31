package com.string;
//Compare to Strings without using equal method.
public class Q7 {
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="shubhangi";
		   String s1="shubhangis";
			boolean isCompare=false;
          if(s.length()==s1.length()) {
          for(int i=0;i<s.length();i++) {
        	 if(s.charAt(i)!=s1.charAt(i)) {
        		  isCompare=false;
        	 }
        	 isCompare=true;
	
}System.out.println("string one is equal to string 2:"+isCompare);}
          else {
        	  
        	  isCompare=false;
        	  System.out.println("both string are equal:"+isCompare);
          }
	}

}
