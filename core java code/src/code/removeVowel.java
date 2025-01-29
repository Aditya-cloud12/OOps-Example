package code;

public class removeVowel {

	public static void main(String[] args) {

		String input = "Hello , I love my India .";
		String result = input.replaceAll("[AEIOUaeiou]", "");
		System.out.println(result);
	}

}
