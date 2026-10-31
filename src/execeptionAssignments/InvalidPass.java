package execeptionAssignments;
//. WAP to create a custom exception on invalid password
public class InvalidPass extends Exception{

	public InvalidPass(String message) {
		super(message);
	}
}
