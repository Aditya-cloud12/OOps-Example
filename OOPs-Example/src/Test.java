
public class Test {
	public static void main(String[] args) {

		Account obj = new Account();

		obj.setAccountNum(66226669);
		obj.setName("Aditya");
		obj.setAddress("Akilabad");
		obj.setBalance(10000.00);
		obj.setState("Bihar");
		obj.setCountry("India");

		long AccountNum = obj.getAccountNum();
		String Name = obj.getName();
		String Address = obj.getAddress();
		double Balance = obj.getBalance();
		String State = obj.getState();
		String Country = obj.getCountry();
		
		System.out.println(AccountNum+"  "+Name+"  "+Address+"  "+Balance+"  "+State+"  "+Country);

	}
}
