package Arrayconcept;

import java.util.Arrays;

public class Comparearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean isEqual = Arrays.equals(arr1, arr2);

        System.out.println("Arrays are equal: " + isEqual);
	}
	
}
