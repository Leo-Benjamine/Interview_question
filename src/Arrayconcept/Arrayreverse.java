package Arrayconcept;

import java.util.Arrays;
import java.util.Iterator;

public class Arrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50, 60}; 
		System.out.println("Original Array: "+ Arrays.toString(arr));
		 // Reversing the array
        for (int i = 0; i < arr.length/2; i++) {
            // 1. Store the element at the current front index (i) in a temporary variable
            int temp = arr[i];

            // 2. Replace the element at the current front index (i) with the element
            //    from the corresponding back index (arr.length - 1 - i)
            arr[i] = arr[arr.length - 1 - i];

            // 3. Place the temporarily stored front element into the corresponding back index
            arr[arr.length - 1 - i] = temp;

            System.out.println("Reversed array: ");
            for (int num : arr) {
            	
            	System.out.print(num + " ");
            }
        }

        System.out.println("\nReversed Array: " + Arrays.toString(arr));
		
	}

}
