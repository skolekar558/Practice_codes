package execeptionAssignments;
//1.WAP to use catch / handle the ArrayIndexOutOfBoundsException exception. 
public class ArrayIndexBoundEx {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		try {
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exeception caught:"+e.getMessage());
		}

	}

}
