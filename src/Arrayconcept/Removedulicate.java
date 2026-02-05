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
			
//	Step 3: How the loop runs (step by step)
//
//	First iteration → num = 1 → set.add(1) → set = {1}
//
//	Second iteration → num = 2 → set.add(2) → set = {1, 2}
//
//	Third iteration → num = 3 → set.add(3) → set = {1, 2, 3}
//
//	Fourth iteration → num = 2 → set.add(2) → already exists → no change → set = {1, 2, 3}
//
//	Fifth iteration → num = 4 → set.add(4) → set = {1, 2, 3, 4}
//
//	Sixth iteration → num = 1 → already exists → no change → set = {1, 2, 3, 4}
//
//	Seventh iteration → num = 5 → set.add(5) → set = {1, 2, 3, 4, 5}
	

}

//A Set in Java:
//Cannot contain duplicate values
//Automatically ignores duplicates when you try to .add() them
//Maintains only unique values

