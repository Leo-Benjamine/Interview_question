package Arrayconcept;

public class Logicalprogram {
/*Progrma name question is
From a given array of integers print the next bigger number for
each number in the array*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 4, 1, 9, 6, 2};
		
		for(int i =0; i<arr.length; i++) {
			int big = Integer.MAX_VALUE;
		for(int j=0; j<arr.length; j++) {
			if(arr[i]<arr[j]) {
				if(arr[j]<big) {
					big=arr[j];
				}
			}
		}
		if(big!=Integer.MAX_VALUE) {
			System.out.print(arr[i]+"->"+big+",");
		}
		else {
			System.out.println(arr[i]+"->");
		}
		}

	}

}
