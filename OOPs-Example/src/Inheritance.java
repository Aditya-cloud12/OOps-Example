
class SupremeClass {
	void m1() {
		System.out.println("SupremeClass :: m1() called");
	}

	void m2() {
		System.out.println("SupremeClass :: m2() called");
	}
}

class Child extends SupremeClass {
	void m1() {
		System.out.println("Child class :: m1() called");
	}

	/*void m2() {
		System.out.println("Child class :: m2() called");
	}*/

	public int hashCode() {
		return 122335588;
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		int s = c.hashCode();
		System.out.println(s);
	}

}
