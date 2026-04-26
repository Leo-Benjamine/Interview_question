package Arrayconcept;

import java.util.Arrays;

public class Secondlargestnumber2 {

	public static void main(String[] args) {
		int[] arr = {30, 20 ,54, 60, 12, 45};
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-2]);

	
		}

}
