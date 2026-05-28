package Arrayconcept;

public class MovetozeroDB {//DB
	
	 public static void main(String[] args) {

	        int a[] = {1,2,0,3,12};

	        int temp[] = new int[a.length];

	        int index = 0;

	        // Store non-zero values
	        for(int i = 0; i < a.length; i++){

	            if(a[i] != 0){
	                temp[index] = a[i];
	                index++;
	            }
	        }

	        // Print result
	        for(int i = 0; i < temp.length; i++){
	            System.out.print(temp[i] + " ");
	            if(i<temp.length-1) {
	            	System.out.print(",");
	            }
	        }
	    }

}
