package Numberprograming;

public class Armstrong {
	
	//An Armstrong number (also called a narcissistic number) is a number that is equal to the sum of the cubes of its digits (for 3-digit numbers).

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153,sum = 0,temp = num;
		
		while(temp>0) {
		int	digit = temp % 10;
		sum+= digit*digit*digit;
		temp /=10;
		
		}
		System.out.println(num ==sum ? "Armstrong" : "Is not Armstrong");

	}

}
