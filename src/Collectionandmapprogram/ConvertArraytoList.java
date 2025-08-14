package Collectionandmapprogram;

import java.util.Arrays;
import java.util.List;

public class ConvertArraytoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Apple", "Cherry", "Banana"};
		List<String> list= Arrays.asList(arr);
		
		System.out.println("Array: " + Arrays.toString(arr));
		System.out.println(list);

	}

}


// Notes:
//Arrays.asList(arr) wraps the array into a fixed-size List.
//You cannot add or remove elements from this list (UnsupportedOperationException if attempted).
//However, you can modify the elements of the list (since it's backed by the array).


