package code;

public class ArrayRipTear {
	public static void main(String[] args) {
	
	int arr[] = {4,5,7,1,2,5,6};
	//sum = 8;
	
	for (int i=0;i<arr.length;i++) {
		for (int j=i+1;j<arr.length;j++) {
			if(arr[i] + arr[j] == 8) {
				System.out.println(arr[i]+","+arr[j]);
			}
		}
	}
		
	
	}

}
