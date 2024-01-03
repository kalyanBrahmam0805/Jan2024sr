
public class Laptop {
int display;
int weight;
String Brand;
String processor;
int ram;
int version;
int cost;
public Laptop(int display, int weight, String brand, String processor, int ram, int version, int cost) {
	super();
	this.display = display;
	this.weight = weight;
	this.Brand = brand;
	this.processor = processor;
	this.ram = ram;
	this.version = version;
	this.cost = cost;
}
void read() {
	System.out.println("read");
}
void watch() {
	System.out.println("watching movies");
}
}



