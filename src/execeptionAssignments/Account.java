package execeptionAssignments;

public class Account {
private double balance;
public Account(double initialBalance) {
	this.balance=initialBalance;
}
public void withdraw(double amount)throws InsufficientBalanceExeception{
	if(amount>balance) {
		throw new InsufficientBalanceExeception("Insufficient balance! Available balance:"+balance);
	}
	balance-=amount;
	System.out.println("withdraw successful! new balance:"+balance);
}
public double getBalance() {
	return balance;
}
}
