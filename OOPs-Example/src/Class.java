
public class Class extends Parent {
	double Marks;
	String Section;

	public static void main(String[] args) {

		Class c = new Class();
		c.id = 1;
		c.Name = "aditya";
		c.Marks = 360.50;
		c.Section = "d";

		System.out.println(c.id + "  " + c.Name + "  " + c.Marks + "  " + c.Section);

	}

}
