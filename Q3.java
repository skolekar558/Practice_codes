package String;
//Write a Java program to get the contents of a given string as a byte array
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
        byte []b=s.getBytes();
        String s1=new String(b);
        System.out.println("given string as a byte array:"+s1);
	}

}
