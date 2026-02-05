package Arrayconcept;

public class Arraymissing {

	public static void main(String[] args) {
     int[] arr = {1, 2, 4, 5};
		int n= 5;
		
		int sum = n*(n + 1)/2;
		
		int actualSumOfArray = 0;
		for(int num : arr) {
			//actualSumOfArray += num;
			actualSumOfArray = actualSumOfArray + num;
		}
		int missingNumber = sum - actualSumOfArray;
		System.out.println("Missing number: "+ missingNumber);
		
//Loop function
//(actualsumofarray += num)
//0+1=1
//1+2=3
//3+4=7
//7+5=12
//15-12 
	

	}

}
