
/*


  public class Driver {
    public static void main(String[] args) {
        Driver d = new Driver();

        Employee e = new Employee();
        e.id = 201;
        e.salary = 200000.00;
        d.print(e);
    }

    void print(Employee e) {
        System.out.println(e.id + " " + e.salary);
    }
}

class Employee {
    int id;
    double salary;
}


*/

//----------------------------------------------------------------------------------------------------------------

/*

  class Doctor {
	String name;
	int age;
	String properties;
}

class Driver {

	void print(Doctor d) {
		System.out.println(d.name + "  " + d.age + "  " + d.properties);
	}

	public static void main(String[] args) {

		Driver d = new Driver();

		Doctor d1 = new Doctor();
		d1.name = "Himashu";
		d1.age = 22;
		d1.properties = "veterinary";

		d.print(d1);
	}

}

*/

//-------------------------------------------------------------------------------------------------------------------

/*

 class Product{
	String Name;
	double Price;
}


class Driver{

	void print (Product P) {
		System.out.println(P.Name+"  "+P.Price);
	}

	public static void main(String[] args) {

		Driver d = new Driver();

		Product P = new Product();
		P.Name = "Shamphoo";
		P.Price = 15.00;

		d.print(P);

	}
}

*/

//------------------------------------------------------------------------------------------------------------------------

/*

class Student {
	String Name;
	int Roll;
	String Address;
	int Marks;
}

class Driver {

	void Print(Student S) {
		System.out.println(S.Name + "  " + S.Roll + "  " + S.Address + "  " + S.Marks);
	}

	public static void main(String[] args) {

		Driver d = new Driver();

		Student S = new Student();

		S.Name = "Himanshu" ;
		S.Roll = 1011;
		S.Address = "Bidupur";
		S.Marks = 480;

		d.Print(S);
	}

}

*/

//-----------------------------------------------------------------------------------------------------------------------
/*

class Players {
	String Name;
	int Jersy_No;
	int run;
}

class Driver {
	void print(Players P) {
		System.out.println(P.Name + "  " + P.Jersy_No + "  " + P.run);
	}

	public static void main(String[] args) {

		Driver M = new Driver();
		Players P1 = new Players();
		P1.Name = "Dhoni";
		P1.Jersy_No = 07;
		P1.run = 65;

		M.print(P1);
	}
}

*/

//-----------------------------------------------------------------------------------------------------


class Chocolates {
	String Name;
	String Brand;
	int Pieces;
	String Type;
}

class Driver {

	void print(Chocolates C) {
		System.out.println(C.Name + "  " + C.Brand + "  " + C.Pieces + "  " + C.Type);
	}

	public static void main(String[] args) {
		Driver D = new Driver();
		Chocolates C = new Chocolates();
		C.Name = "DiaryMilk";
		C.Brand = "Cadbury";
		C.Pieces = 10;
		C.Type = "Dark";

		D.print(C);
	}
}


//---------------------------------------------------------------------------------------------------------------------








