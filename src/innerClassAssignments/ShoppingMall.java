package innerClassAssignments;

/*Create a example of method inner class in which there is an outer class called Shopping Mall which 
consist of method doShoping() . Create a local inner class Cart and add items to Cart and display the
bill in java*/
public class ShoppingMall {

	public void doShoping() {
		class Cart {
			private int iCount = 0;
			private double totalBill = 0.0;

			public void addItem(String itemName, double price) {
				iCount++;
				totalBill += price;
				System.out.printf(itemName + "added to the cart.price:$" + price);
				System.out.println(" ");
			}

			public void displayBill() {
				System.out.println("Total item in the cart:" + iCount);
				System.out.printf("Total Bill:$%.2f/n", totalBill);
			}
		}

		Cart cart = new Cart();
		cart.addItem("Hockystick ", 199.99);
		cart.addItem("Football ", 120.00);
		cart.displayBill();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingMall mall = new ShoppingMall();
		mall.doShoping();
	}

}
