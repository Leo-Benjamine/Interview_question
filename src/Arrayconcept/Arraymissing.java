package Arrayconcept;

public class Arraymissing {

	public static void main(String[] args) {
     int[] arr = {1, 2, 4, 5};
		int n= 5;
		
		int sum = n*(n + 1)/2;
		
		int actualSumOfArray = 0;
		for(int num : arr) {
			actualSumOfArray += num;	
		}
		int missingNumber = sum - actualSumOfArray;
		System.out.println("Missing number: "+ missingNumber);
		
	

	}

}
