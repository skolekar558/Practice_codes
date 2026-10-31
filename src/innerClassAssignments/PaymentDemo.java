package innerClassAssignments;

public class PaymentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment upiPayment = new Payment() {
			@Override
			public void pay(double amt) {
				System.out.println("paying: " + amt + "  -using upi");
			}
		};
		upiPayment.pay(100.50);

//Payment using creditcard

		Payment creditCardPayment = new Payment() {
			@Override
			public void pay(double amt) {
				System.out.println("paying: " + amt + " -using creditCard");

			}

		};
		creditCardPayment.pay(2000.50);

//Payment using debitcard

		Payment debitCardPayment = new Payment() {
			@Override
			public void pay(double amt) {
				System.out.println("paying: " + amt + " -using  debitCard");
			}
		};
		debitCardPayment.pay(5000.50);
	}

}
