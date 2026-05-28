package Numberprograming;

public class SumEvenNumbersDB {
	 public static void main(String[] args) {//DB

	        int arr[] = {1,2,3,4,5,6,7,8,9};

	        int sum = 0;

	        for(int num : arr){

	            if(num % 2 == 0){
	                sum = sum + num;
	            }
	        }

	        System.out.println("Sum of Even Numbers = " + sum);
	    }

}
