package Arrayconcept;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arratreversw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        String[] arr = {"Apple", "Banana", "Cherry"};		        
		        System.out.println("Original Array: "+ Arrays.toString(arr));
//"Original Array: "+ Arrays.toString(arr)
		        // convert to list and reverse
		        List<String> list = Arrays.asList(arr);
		        Collections.reverse(list);
		        System.out.println(list);
		    }
	}

