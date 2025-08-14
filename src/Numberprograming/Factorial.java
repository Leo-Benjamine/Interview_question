package Numberprograming;

public class Factorial {

	public static void main(String[] args) {
		// The factorial of a number n is the product of all positive integers less than or equal to n
     int num = 5, fact =1;
     
     for(int i =2; i<= num; i++) {
    	 fact *= i;
     }
     
     System.out.println("factorial: " + fact);
	}

}
