

package Arrayconcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Commonelement {//Find common element in two array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
	        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 3, 4));

	        set1.retainAll(set2); // Keeps only the common elements in set1

	        System.out.println("Common elements: " + set1);
	    
	

	}

}
