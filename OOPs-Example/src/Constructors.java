
public class Constructors {

	int id;
	String names;
	long phone_no;
	double marks;
	String address;

	Constructors(int id, String names, long phone_no, double marks, String address) {
		this.id = id;
		this.names = names;
		this.phone_no = phone_no;
		this.marks = marks;
		this.address = address;

		System.out
				.println(this.id + "  " + this.names + "  " + this.phone_no + "  " + this.marks + "  " + this.address);
	}

	public static void main(String[] args) {
		Constructors s1 = new Constructors(1, "aman", 7759081435l, 360, "hajipur");
		Constructors s2 = new Constructors(2, "aditya", 9608886529l, 240, "Bihar");
	}

}
