package Arrayconcept;

public class Arraydscendingorderwithoutusingsort {
	public class SortArrayDescending {

	    public static void main(String[] args) {

	        int[] arr = {5, 2, 9, 1, 3};

	        // Bubble Sort for Descending Order
	        for (int i = 0; i < arr.length - 1; i++) {
	            for (int j = 0; j < arr.length - 1 - i; j++) {

	                // Change condition for descending
	                if (arr[j] < arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }

	        // Print result
	        System.out.println("Descending Order:");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
	}


}
