package Numberprograming;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The Fibonacci sequence is a series of numbers
		//Each number = sum of the two previous numbers
        //0, 1, 1, 2, 3, 5, 8, 13, ...
    int n = 10, a=0, b=1;
    System.out.print("Fibonacci : " + a + " " + b + " ");
    
    for(int i = 2; i<n; i++) {
    	int c =a + b;
    	System.out.println(c + " ");
    	a = b;
    	b = c;
    	
    	
    }
		

	}

}
