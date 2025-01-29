package code;

public class MinMaxFinder {
	public static void main(String[] args) {
		
		int[] numbers = {5,2,8,1,9,3};
		
		// Find minimum and maximum 
		
		int min = numbers[0];
		int max = numbers[0]; 
		
		for (int i=1; i<numbers.length; i++)
		{
			   if (numbers[i] < min) {
				   min = numbers[i];
			   }
			
			   if (numbers[i] > max) {
				   max = numbers[i];
			   }		
		}
		
		// Second Method
		/*
		 * int min = Arrays.stream(numbers).min().getAsInt();
		   int max = Arrays.stream(numbers).max().getAsInt();   
		*/
		
		// Print Results
		
		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);
		
	}
}
    