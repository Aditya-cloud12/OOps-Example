
public class Bank {

	public static void main(String[] args) {

		SBIBank b1 = new SBIBank();
		SBIBank b2 = new SBIBank();

		boolean bankObjStatus = b1.equals(b2);
		System.out.println("Both Bank are equal ?? ::" + bankObjStatus);

		String s3 = new String("aditya");
		String s4 = new String("aditya");

		boolean StringObjStatus = s3.equals(s4);
		System.out.println("Both Bank are equal ?? ::" + StringObjStatus);

	}

}
