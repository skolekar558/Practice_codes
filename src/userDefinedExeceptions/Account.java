package userDefinedExeceptions;
/*In a banking application, if a user attempts to transfer funds to an account that does not exist, an AccountNotFoundException should be raised.

*/
public class Account {
	private static final String[] existingAccounts = { "12345", "67890", "54321" };

	public void transferFund(String accNo) throws AccountNotFoundException {
		if (!accountExist(accNo)) {
			throw new AccountNotFoundException("Account:" + accNo + " Not Found !");
		}
		System.out.println("Fund transfer successfully to account:" + accNo);
	}

	private boolean accountExist(String accNo) {
		for (String account : existingAccounts) {
			if (account.equals(accNo)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		try {
			a.transferFund("12345");
			a.transferFund("99999");

		} catch (AccountNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
