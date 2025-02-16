//constructors
public class Product {

	int id;
	String name;
	int price;

	Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
		System.out.println(this.id + "  " + this.name + "  " + this.price);
	}

	public static void main(String[] args) {
		Product p1 = new Product(1, "rice", 60);
		Product p2 = new Product(2, "wheat", 70);
		Product p3 = new Product(3, "sugar", 40);
		Product p4 = new Product(4, "pulse", 220);
		Product p5 = new Product(5, "oil", 140);
		Product p6 = new Product(6, "floor", 30);
		Product p7 = new Product(7, "grams", 80);
	}
}
