
public class TryCatchFinally {
	public static void main(String[] args) {
		System.out.println("main() method started...");
		try {
			System.out.println("try block started...");
			int i = 10 / 0;
			System.out.println("try block ended...");
		} catch (Exception e) {
			System.out.println("Catch block");
			e.printStackTrace();
		} finally {
			System.out.println("finally block");
		}
		System.out.println("main() method ended...");
	}

}
