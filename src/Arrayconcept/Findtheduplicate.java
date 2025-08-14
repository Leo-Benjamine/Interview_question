package Arrayconcept;
public class Findtheduplicate {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 2, 7, 8, 8};
		System.out.println("Finding duplicate elements in the array: " + java.util.Arrays.toString(arr));		
		//The nested loop logic to find duplicate
		for (int i = 0; i<arr.length; i++) {
			for(int j=i + 1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
				System.out.println("Duplicte found: " + arr[i]);	
				}
			}	
		}	
	}
}
//Steps;
//Enter the value int[] arr = {1, 2, 3, 4, 2, 7, 8, 8};
//Next print the current Number System.out.println("Finding duplicate elements in the array: " + java.util.Arrays.toString(arr));