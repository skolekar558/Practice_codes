package userDefinedExeceptions;
/*In a library system, if a user tries to borrow a book that is currently checked out by someone else, a BookNotAvailableException should be thrown.*/
public class Library {
	private boolean isAvailable;

	public Library(boolean isAvailable) {
		this.isAvailable = isAvailable;

	}

	public void borrowBook() throws BookNotAvailableException {
		if (!isAvailable) {
			throw new BookNotAvailableException("Book Not Available! ");
		}
		System.out.println("Book borrowed successfully !");
		isAvailable = false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library L = new Library(true);
		try {
			L.borrowBook();
		} catch (BookNotAvailableException e) {
			System.out.println(e.getMessage());
		}
	}

}
