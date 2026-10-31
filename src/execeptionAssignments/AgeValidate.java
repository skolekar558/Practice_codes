package execeptionAssignments;

public class AgeValidate {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("person is not eligible for vote");
		}
		else {
			System.out.println("person is eligible to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(13);
		System.out.println("welcome to vote system");
	}

}
