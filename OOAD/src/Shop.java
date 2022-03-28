import java.util.*;

public class Shop {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setPrice(99);
		System.out.println(b1.getPrice());
		
		createBooks();
	}

	private static void createBooks() {
		Book []shelf = new Book[10];
		Random rand = new Random();
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			Book ib = new Book();
			ib.setPrice(rand.nextFloat(70, 100));
			shelf[i] = ib;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(shelf[i].getPrice());
		}
		
	}
}
