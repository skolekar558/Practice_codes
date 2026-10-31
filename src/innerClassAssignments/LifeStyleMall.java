package innerClassAssignments;

/*create a class LifeStyle Mall having mallName, location, custid, custName, mobileNo.
In this class create a member innerclass AnnualPayCard having fields cardid, expiryDate, balance
Create a customer and then alot AnnualPayCard to them.
Display the details of Customer along with card details*/
public class LifeStyleMall {

	private String mallName;
	private String location;

	private int custId;
	private String custName;
	private String mobileNo;

	public LifeStyleMall(String mallName, String location, int custId, String custName, String mobileNo) {
		this.mallName = mallName;
		this.location = location;
		this.custId = custId;
		this.custName = custName;
		this.mobileNo = mobileNo;
	}

	class AnnualpayCard {
		private String cardId;
		private String expDate;
		private double balance;

		public AnnualpayCard(String cardId, String expDate, double balance) {
			this.cardId = cardId;
			this.expDate = expDate;
			this.balance = balance;

		}

		public void displayCardDetails() {
			System.out.println("CardId: " + cardId);
			System.out.println("ExpiryDate: " + expDate);
			System.out.printf("Balance: $%.2f\n ", balance);
		}
	}

	public void displayCustomerDetails(AnnualpayCard card) {
		System.out.println("CustId: " + custId);
		System.out.println("CustomerName :" + custName);
		System.out.println("MobileNo: " + mobileNo);
		card.displayCardDetails();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeStyleMall mall = new LifeStyleMall("LifestyleMall", "dontown", 101, "Suresh Rao", "123-456-7890");
		LifeStyleMall.AnnualpayCard card = mall.new AnnualpayCard("C12345", "12/15", 1000.00);
		mall.displayCustomerDetails(card);
	}

}
