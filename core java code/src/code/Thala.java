package code;

public class Thala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 5; i++) {
			for (int j = i; j <= 5; j++) {
				if (i >= 2 && j >= 2 && i <= 4 && j <= 4) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
