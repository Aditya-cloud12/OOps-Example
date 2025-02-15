/*
public class Person {

	int id;
	String name;

	Person[] m2() {
		Person p1 = new Person();
		p1.id = 101;
		p1.name = "Raju";

		Person p2 = new Person();
		p2.id = 102;
		p2.name = "rani";

		Person p3 = new Person();
		p3.id = 103;
		p3.name = "himanshu";

		Person[] arr = { p1, p2, p3 };

		return arr;

	}

	void m1(Person p1, Person p2) {
		System.out.println(p1.id + "  " + p1.name);
		System.out.println(p2.id + "  " + p2.name);
	}

	public static void main(String[] args) {

		Person p = new Person(); // obj1 created

		Person p1 = new Person(); // obj2 created
		p1.id = 101;
		p1.name = "Raj";

		Person p2 = new Person(); // obj3 created
		p2.id = 102;
		p2.name = "Shivam";

		p.m1(p, p2);

		Person[] arr = p.m2();

		for (Person person : arr) {
			System.out.println(person.id + "  " + person.name);
		}

	}

}
*/

//----------------------------------------------------------------------------------------



class Person {

	int id;
	String name;
	String address;

	Person[] m4() {

		Person f = new Person();
		f.id = 100;
		f.name = "alok";
		f.address = "bihar";

		Person g = new Person();
		g.id = 102;
		g.name = "raj";
		g.address = "hajipur";

		Person h = new Person();
		h.id = 103;
		h.name = "sumit";
		h.address = "akilabad";

		Person k = new Person();
		k.id = 104;
		k.name = "himanshu";
		k.address = "m.p";

		Person[] arr = { f, g, h, k };
		return arr;
	}

	public static void main(String[] args) {

		Person M = new Person();

		Person[] arr = M.m4();

		for (Person person : arr) {
			System.out.println(person.id + "  " + person.name + "  " + person.address);
		}

	}

}


//----------------------------------------------------------------------------------------


