package Spring5;

public class Laptop {

	public String brand;
	public int price;



public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return  price;
}
public void setPrice(int price) {
	this.price = price;
}
public String toString() {
	return "Laptop [brand=" + brand + ", price=" + price + "]";
}
public Laptop(String brand, int price) {
	super();
	this.brand = brand;
	this.price = price;
}
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
}
