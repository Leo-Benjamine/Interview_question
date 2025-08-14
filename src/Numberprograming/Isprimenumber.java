package Numberprograming;

public class Isprimenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 7;
	boolean isPrime	= n>1;
	
	for(int i = 2; i<=Math.sqrt(n); i++) {
		if(n%i==0) {
			isPrime = false;
			break;
		}
	}
		System.out.println(isPrime ? "prime" : "is not prime");

	}

}
