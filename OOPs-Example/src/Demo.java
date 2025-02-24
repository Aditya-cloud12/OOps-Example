
public class Demo {
	{
		System.out.println("i am from instance block");
	}

	public Demo() {
		System.out.println("i am from construcor");

	}

	static {
		System.out.println("I am from Static block");
	}

	public static void main(String[] args) {
		System.out.println("I am from main method");
		Demo d = new Demo();
	}
}
