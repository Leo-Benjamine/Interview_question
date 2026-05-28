package Arrayconcept;

public class ReverseonlynumberDB {//DB
	 public static void main(String[] args) {

	        Object arr[] = {'a',1,'b',2,'c',3};

	        int start = 0;
	        int end = arr.length - 1;

	        while(start < end){

	            // Find number from start
	            while(!(arr[start] instanceof Integer)){
	                start++;
	            }

	            // Find number from end
	            while(!(arr[end] instanceof Integer)){
	                end--;
	            }

	            // Swap numbers
	            Object temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;

	            start++;
	            end--;
	        }

	        // Print output
	        for(Object value : arr){
	            System.out.print(value + " ");
	        }
	    }
}
