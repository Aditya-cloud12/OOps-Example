
public class Tthrow {
	public String getName(int id) throws Exception {
		if (id == 100) {
			return "aditya";
		} else if (id == 101) {
			return "Raj";
		} else {
			throw new Exception("Name Not Found");
		}
	}

	public static void main(String[] args) throws Exception {
		Tthrow d = new Tthrow();
		String Name = d.getName(100);
		System.out.println(Name);
	}
}
