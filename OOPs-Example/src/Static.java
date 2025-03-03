
public class Static {

	public void add(int... a) {
		int sum = 0;
		for (int x : a) {
			sum = sum + x;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Static s = new Static();
		s.add(10, 20, 30);
		s.add(1000, 1000, 1000, 200 , 120 , 140);
	}

}
