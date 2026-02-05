package Collectionandmapprogram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListElements {//Dcending order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> arry =  Arrays.asList(3, 1, 2);
        System.out.println("Orignail list of element: "+ arry);
        Collections.sort(arry);
       
        for(int i= arry.size()-1; i>=0; i--){
        	   
        	   System.out.println(arry.get(i));
        	}
	}

}
