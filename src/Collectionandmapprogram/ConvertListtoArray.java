package Collectionandmapprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<String> list  = new ArrayList<>();
         list.add("Apple");
         list.add("Cherry");
         list.add("Banana");
         
         System.out.println("List element: " + list);
     String[] arr =  list.toArray(new String[0]);
     System.out.println("Array: "+ Arrays.toString(arr));
     
//     Explanation:
//    	 list.toArray(new String[0]):
//    	 Converts the List<String> into a String[].
//    	 Passing new String[0] is a common idiom — the method will create a new array of the appropriate size internally.
        
	}

}
