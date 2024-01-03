package oop;

public class Laptop {
	int price;
	int ram;
	String processor;
	String brand;
	int memory;
	int storage;
	public Laptop(int price, int ram, String brand,String processor, int memory, int storage) {
		super();
		this.price = price;
		this.ram = ram;
		this.processor = processor;
		this.brand=brand;
		this.memory = memory;
		this.storage = storage;
	}
	void read() {
		System.out.println("laptop s used for reading");
	}
	void game() {
		System.out.println("latop is used for gaming");
	}
}


