package userDefinedExeceptions;
/*In an online payment processing system, if a user attempts to make a payment with an invalid credit card number, an InvalidCardException should be thrown.*/
public class Payment {


	public void proceePayment(String creditCardNo)throws InvaliCardException {
		if(creditCardNo.length() !=16) {
			throw new InvaliCardException("Invalid Card NO !");

		}
		System.out.println("payment proceed with cardNo:"+creditCardNo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment p=new Payment();
		try {
			p.proceePayment("1234567891234564");

		}
		catch(InvaliCardException e){
			System.out.println(e.getMessage());
		}

	}

}
