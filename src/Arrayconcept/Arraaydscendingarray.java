package Arrayconcept;

import java.util.Arrays;

public class Arraaydscendingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5, 6, 3, 7, 2, 8, 4};
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		/* Integer[] arr = {5, 2, 8, 1, 9};

Arrays.sort(arr, Collections.reverseOrder());

System.out.println("Descending Order:");
for (int num : arr) {
    System.out.print(num + " ");
}*/

	}

}
