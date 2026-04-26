package Arrayconcept;

import java.util.Arrays;
import java.util.List;

public class Cubeonlistofelementsndfilternumbersgreaterthan50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list =  Arrays.asList(2, 4, 6, 8, 9);
		
		for(int num : list) {
			int cube = num* num* num;
			if(cube>50) {
				System.out.println(cube);
			}
		}
	}

}
