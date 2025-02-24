
public class BankDemo {

	public static void main(String[] args) {

		RBI r;
		// AxisBank a;
		// HDFCBank h;

		r = new AxisBank();

		r.moneyTransfer();
		r.checkBalance();

		r = new HDFCBank();

		r.moneyTransfer();
		r.checkBalance();

	}

}
