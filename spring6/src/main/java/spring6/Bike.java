package spring6;

public class Bike {
	int price;
	String brand;
	@Override
	public String toString() {
		return "Bike [price=" + price + ", brand=" + brand + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Bike(int price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	
	public Bike() {
		super();
		
		// TODO Auto-generated constructor stub
	}

}
