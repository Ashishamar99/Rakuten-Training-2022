import java.io.IOException;

public class ExceptionsDemo {
	public static void main(String[] args) throws IOException {
		Book book = new Book();
		try {
			book.setPrice(-1000);
		} catch (InvalidPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
