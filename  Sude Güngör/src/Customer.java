
public class Customer extends Menu {
protected int age;
protected String name;
protected double total;


	public Customer(int age, String name, double total) {
	super();
	this.age = age;
	this.name = name;
	this.total = total;
}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
