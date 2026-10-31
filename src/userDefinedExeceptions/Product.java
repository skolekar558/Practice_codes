package userDefinedExeceptions;
/*In a product inventory system, you want to manage stock levels. 
If an attempt is made to reduce the stock below zero when selling a product, an OutOfStockException should be thrown.*/
public class Product {
	private String name;
	private int stock;

	public Product(String name, int stock) {
		this.name = name;
		this.stock = stock;
	}

	public void sell(int quantity) throws OutOfStockException {
		if (quantity > stock) {
			throw new OutOfStockException("Cannot sell " + quantity + " of " + name + ". Only " + stock + " in stock.");
		}
		stock -= quantity;
		System.out.println("Sold " + quantity + " of " + name + ". Remaining stock: " + stock);
	}

	public static void main(String[] args) {
		Product product = new Product("Widget", 10);

		try {
			product.sell(5); // Successful sale
			product.sell(6); // This will trigger the exception
		} catch (OutOfStockException e) {
			System.out.println(e.getMessage());
		}
	}
}
