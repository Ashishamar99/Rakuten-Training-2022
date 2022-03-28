enum STATUS{
	NEW, DAMAGED, RETURNED
}
public class Book {
	private String title;
	private float price;
	private STATUS status;
	
	public Book() {
		// TODO Auto-generated constructor stub
		this.status = STATUS.NEW;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		if(price<=0)
			throw new IllegalArgumentException("Price can't be 0.");
		this.price = price;
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
}
