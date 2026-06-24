
package Arrayconcept;

public class Mergetwoway2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        
        //create empty Integer
        int[] merged = new int[arr1.length + arr2.length];

        int index = 0;

        // Copy first array
        for (int i = 0; i < arr1.length; i++) {
            merged[index] = arr1[i];
            index++;
        }

        // Copy second array
        for (int i = 0; i < arr2.length; i++) {
            merged[index] = arr2[i];
            index++;
        }

        // Print merged array
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
	
 //System.out.println(merged);
	}

}
