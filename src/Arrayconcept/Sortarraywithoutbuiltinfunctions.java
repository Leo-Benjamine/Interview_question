package Arrayconcept;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//You've provided the classic Bubble Sort algorithm! This code snippet sorts an array in ascending order. Let's create a complete Java example and then trace its execution.
//Java
public class Sortarraywithoutbuiltinfunctions {
	public static void main(String[] args) {
		int[] arr = {5, 1, 4, 2, 8};
		System.out.println("Original array: " + Arrays.toString(arr));
		// Bubble Sort Algorithm
        // Outer loop: controls the number of passes
        for (int i = 0; i < arr.length - 1; i++) {	
            // Inner loop: compares adjacent elements and swaps them
            for (int j = i + 1; j < arr.length; j++) {                
                if (arr[i] > arr[j]) {
                    // Swap elements if arr[i] is greater than arr[j]
                    int temp = arr[i];// store bigger value
                    arr[i] = arr[j];// put smaller value in left position
                    arr[j] = temp;// put bigger value in right position
                }  
            }
        }

        System.out.println("Sorted array: ");
        for (int num : arr) {
        	System.out.println(num + " ");
        }
    }

		
	
}
