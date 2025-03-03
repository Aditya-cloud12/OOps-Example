import aditya.it.InvalidNumberException;

public class MethodsException {

	void m2(int a, int b) throws Exception {
		System.out.println("m2() - Started");
		try {

			int c = a / b;
			System.out.println(c);

		} catch (Exception e) {

			throw new InvalidNumberException("Invalid Number");
		}
		System.out.println("m2() - ended");

	}

	void m1(int a, int b) throws Exception {
		System.out.println("m1() -- Started ");
		m2(a, b);
		System.out.println("m1() -- Ended");
	}

	public static void main(String[] args) {
		System.out.println("main() -- started");
		try {
			MethodsException m = new MethodsException();
			m.m1(10, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main() -- ended");
	}
}
