package Arrayconcept;

import java.util.HashSet;
import java.util.Set;

public class Removedulicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 2, 4, 1, 5};
		
		Set<Integer> set = new HashSet<>();
		for (int num : arr) {
			set.add(num);
		}
		System.out.println("unique elements : " + set);
			
		}
			

	

}

//A Set in Java:
//Cannot contain duplicate values
//Automatically ignores duplicates when you try to .add() them
//Maintains only unique values

