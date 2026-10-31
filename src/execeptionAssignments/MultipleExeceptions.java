package execeptionAssignments;
//2.WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and ArithmeticException 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipleExeceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int divisor=0;
		try {
			File file = new File("nonexistent_file.txt");  
			Scanner scanner = new Scanner(file);  
			System.out.println(a[5]);
			int result=10/divisor;
		}
		catch (FileNotFoundException e) {  
			System.out.println("File not found: " + e.getMessage());  
		}  
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exeception caught:"+e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("divide by zero exception:"+e.getMessage());
		}
	}

}
