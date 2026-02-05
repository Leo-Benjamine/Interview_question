package Arrayconcept;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Findthesmallelement {
	public static void main(String[] args) {
		int[] arr = {4, 3, 9, 1};
		int min= arr[0];
		for(int num : arr) {
			if(num <min)min =num;
		}
		System.out.println("Smalllest: " + min);
		
		//Using Array
		Arrays.sort(arr);
		System.out.println(arr[0]);
		
		//Using Collection
		
		/*List<int> list = Arrays.asList(arr);
		Collections.sort(list);
		int[] smallest = list.get(0);
		System.out.println(smallest);*/
		
	}

}
