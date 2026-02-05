package Arrayconcept;

import java.util.Arrays;

public class Arrayaccendingorder {
	
	public static void main(String[] args) {
		
		int[] arr = {5, 6, 3, 7, 2, 8, 4};
		
		Arrays.sort(arr);
		
		for(int num :arr) {
			System.out.print(num+ " ");
		}
		
	}

}
