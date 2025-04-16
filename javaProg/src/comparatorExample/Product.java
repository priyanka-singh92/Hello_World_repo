package comparatorExample;

public class Product {
	
	Integer pid;
	Double price;
	Double rating;
	
	public Product(Integer pid, Double price, Double rating) {
		super();
		this.pid = pid;
		this.price = price;
		this.rating = rating;
	}

	@Override
	public String toString() {
		
		return "[PID: "+pid+ ", Price: "+price+ ", Rating: "+rating+"]";
	}
	
	
	
	
	

}
