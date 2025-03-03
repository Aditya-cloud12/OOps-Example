
public class Wrapper {
	public static void main(String[] args) {
		byte b = 20;
		System.out.println(b);

		Byte b1 = new Byte(b);      //Auto-boxing
		System.out.println(b1);

		byte b2 = b1;               //Auto-un-boxing
		System.out.println(b2);
	}

}
