
public class InstanceVariable {

	int age;

	public static void main(String[] args) {
		InstanceVariable raju = new InstanceVariable();
		raju.age = 20;
		System.out.println(raju.age);

		InstanceVariable rani = new InstanceVariable();
		rani.age = 18;
		System.out.println(rani.age);

		InstanceVariable aditya = new InstanceVariable();
		System.out.println(aditya.age);
	}

}
