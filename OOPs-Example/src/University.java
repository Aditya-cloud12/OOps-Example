/*

public class University {
	int id;
	String name;

	public static void main(String[] args) {

		University u = Uiversity.m1(102);
		System.out.println(u.id + "  " + u.name);
	}

	static University m1(int id) {
		University u = new University();
		if (id == 101) {
			u.id = 101;
			u.name = "Oxford";
		} else if (id == 102) {
			u.id = 102;
			u.name = "MPU";
		}
		return u;

	}
}

*/

//----------------------------------------------------------------------------------------------------------------------



public class University {

	int id;
	String name;
	String address;
	String course;
	long phonenumber;

	public static void main(String[] args) {
		University n = University.s2(201);
		System.out.println(n.id + "  " + n.name + "  " + n.address + "  " + n.course + "  " + n.phonenumber);
		String str = n.s2();
		System.out.println(str);

	}

	String s2() {
		String s = "Hello";
		return s;
	}

	static University s2(int id) {
		University n = new University();
		if (id == 100) {
			n.id = 100;
			n.name = "aditya";
			n.address = "bihar";
			n.course = "btech";
			n.phonenumber = 9608886529l;
		} else if (id == 201) {
			n.id = 201;
			n.name = "Sonu";
			n.address = "indrapuri";
			n.course = "btech";
			n.phonenumber = 7759081435l;
		}
		return n;
	}

}



//----------------------------------------------------------------------------------------------------------------------