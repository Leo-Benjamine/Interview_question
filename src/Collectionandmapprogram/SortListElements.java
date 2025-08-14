package Collectionandmapprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> list =  Arrays.asList(3, 1, 2);
        System.out.println("Orignail list of element: "+ list);
        Collections.sort(list);
        
        System.out.println("Sorting the value : " +list);
	}

}
