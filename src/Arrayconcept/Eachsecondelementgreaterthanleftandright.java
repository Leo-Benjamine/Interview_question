package Arrayconcept;

import java.util.Arrays;

public class Eachsecondelementgreaterthanleftandright {

	//note in this arry starting even number it should be shown on error
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {50, 40, 20, 30, 60, 10, 70};
		Arrays.sort(arr);
		//System.out.println(asending);*/
		
	// 10, 20 ,30, 40 50, 60, 70 
	// 0,   1, 2,  3, 4,  5,  6	
		for(int i=1; i<arr.length; i=i+2) {
			int temp =arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		

	}

}
