package execeptionAssignments;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new Account(1000.00);
		try {
			myAccount.withdraw(5000.00);
			myAccount.withdraw(600);
		} catch (InsufficientBalanceExeception e) {
			System.out.println("Error:" + e.getMessage());
		}
	}

}
