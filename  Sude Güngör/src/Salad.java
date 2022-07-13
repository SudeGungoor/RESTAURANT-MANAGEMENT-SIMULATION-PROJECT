
public class Salad {
	protected String name;
	protected double price;
	protected double stock;
	
	public Salad(String name, double price, double stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;	
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getStock() {
		return stock;
	}
	public void setStock(double a) {
		this.stock = a;
	}

}
