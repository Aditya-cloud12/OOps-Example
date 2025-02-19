class RBIBank {
	boolean checkEligibility() {
		// document verification logic
		return true;
	}

	double getHomeLoanWithIntresetRate() {
		return 10.55;
	}

	double getPersonalLoanWithIntresetRate() {
		return 8.77;

	}

}

public class SBIBank extends RBIBank {

	double getHomeLoanWithIntresetRate() {
		return 12.50;
	}

	public String applyHomeLoan() {
		boolean status = checkEligibility();

		if (status) {
			double HomeLoanWithIntresetRate = getHomeLoanWithIntresetRate();
			String msg = " your loan amount is approved";
			return msg;

		} else {
			return "you are not eligibile";
		}
	}

	public static void main(String[] args) {
		SBIBank bank = new SBIBank();
		String msg = bank.applyHomeLoan();
		System.out.println(msg);
	}

}
