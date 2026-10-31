package execeptionAssignments;

public class PasswordValidate {
	public static void validatepassword(String password)throws InvalidPass{
		if(password.length()<8||
				!password.matches(".*[A-Z].*")||
				!password.matches(".*[a-z].*")||
				!password.matches(".*[0-9].*")) {
			throw new InvalidPass("password must be atleast 8 characters long contain at least on uppercase &lowercase letter & one digit");


		}
		else {
			System.out.println("password is valid");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validatepassword("pass1");
		}
		catch(InvalidPass e) {
			System.out.println("caught an exception:"+e.getMessage());
		}
		//Test with valid password
		try {
			validatepassword("validPass1");
		}
		catch(InvalidPass e) {
			System.out.println("caught exeception :"+e.getMessage());
		}
	}
}
