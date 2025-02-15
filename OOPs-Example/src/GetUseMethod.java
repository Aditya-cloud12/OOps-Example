/*


public class GetUseMethod {
	public static void main(String[] args) {
		GetUseMethod d = new GetUseMethod();
		Person P = d.getPerson();
		System.out.println(P.id + "  " + P.name + "  " + P.age);

	}

	Person getPerson() {
		Person P = new Person();
		P.id = 101;
		P.name = "Aditya";
		P.age = 23;

		return P;
	}

}

class Person {
	int id;
	String name;
	int age;
}

*/

//-----------------------------------------------------------------------------------------------------------------
/*

class College {
	int id;
	String name;
}

class GetUseMethod {

	College getCollege() {
		College c = new College();
		c.id = 230;
		c.name = "MPU";

		return c;

	}

	public static void main(String[] args) {

		GetUseMethod g = new GetUseMethod();
		College c = g.getCollege();
		System.out.println(c.id + "  " + c.name);
	}

}
*/

//-----------------------------------------------------------------------------------------------------------------
/*


class Product {
	String name;
	double price;

}

class GetUseMethod {

	Product x() {
		Product x = new Product();
		x.name = "Rice";
		x.price = 32.00;
		return x;
	}

	public static void main(String[] args) {
		GetUseMethod v = new GetUseMethod();
		Product x = v.x();
		System.out.println(x.name + "  " + x.price);

	}

}

*/
//-----------------------------------------------------------------------------------------------------------------
/*

class Rent {
	String name;
	Double amount;
	String month;

}

class GetUseMethod {

	Rent R() {
		Rent R = new Rent();
		R.name = "Aditya";
		R.amount = 2300.00;
		R.month = "February";

		return R;
	}

	public static void main(String[] args) {
		GetUseMethod M = new GetUseMethod();
		Rent R = M.R();
		System.out.println(R.name + "  " + R.amount + "  " + R.month);
	}
}

*/

//-----------------------------------------------------------------------------------------------------------------

/*
class Income {
	String name;
	Double rupees;
	String month;
}

class GetUseMethod{
	Income i() {
	Income i = new Income();
	i.name="Himanshu";
	i.rupees=700000.00;
	i.month="february";
	return i;
	}
	public static void main(String[] args) {
		GetUseMethod n = new GetUseMethod();
		Income i = n.i();
		System.out.println(i.name+" "+i.rupees+"  "+i.month);
	}

}

*/

//-----------------------------------------------------------------------------------------------------------------
/*

class Students {
	int id;
	String name;
	int marks;
}
class GetUseMethod{
	public static void main(String[] args) {
		GetUseMethod  g = new GetUseMethod();
		Students s = g.s(101);
		System.out.println(s.id+"  "+s.name+"  "+s.marks);
	}



	Students s(int id) {
	   Students s = new Students ();
	   if (id==101) {
		   s.id = 101;
		   s.name = "aditya";
		   s.marks = 275;
	   } else if(id==102) {
		   s.id = 102;
		   s.name = "Mohan";
		   s.marks = 340;

	   }
	   return s;
	}
}

*/

//-----------------------------------------------------------------------------------------------------------------------
/*

class Players {
	int id;
	String name;
	int age;
}

class GetUseMethod {

	public static void main(String[] args) {

		GetUseMethod j = new GetUseMethod();
		Players q = j.m1(45);
		System.out.println(q.id + "  " + q.name + "  " + q.age);
	}

	Players m1(int id) {
		Players q = new Players();
		if (id == 07) {
			q.id = 07;
			q.name = "MS dhoni";
			q.age = 45;

		} else if (id == 18) {
			q.id = 18;
			q.name = "virat kohali";
			q.age = 40;

		} else if (id == 45) {

			q.id = 45;
			q.name = "rohit sharma";
			q.age = 42;

		} else if (id == 20) {
			q.id = 20;
			q.name = "Abhishek sharma";
			q.age = 29;
		}
		return q;
	}

}

*/
//-------------------------------------------------------------------------------------------------------

class Students {
	int id;
	String name;
	String branch;
	String Address;
	String course;
}

class GetUseMethod {
	public static void main(String[] args) {
		GetUseMethod m2 = new GetUseMethod();
		Students g = m2.s1(234);
		System.out.println(g.id + "  " + g.name + "  " + g.branch + "  " + g.Address + "  " + g.course);
	}

	Students s1(int id) {
		Students s2 = new Students();
		if (id == 230) {
			s2.id = 230;
			s2.name = "Aditya";
			s2.branch = "B.tech";
			s2.Address = "Bihar";
			s2.course = "CSE";
		} else if (id == 232) {
			s2.id = 232;
			s2.name = "himanshu";
			s2.branch = "B.tech";
			s2.Address = "M.P";
			s2.course = "CSE";
		} else if (id == 234) {
			s2.id = 234;
			s2.name = "Monu yadav";
			s2.branch = "B.tech";
			s2.Address = "Bidupur";
			s2.course = "E.c";
		}
		return s2;

	}

}


















