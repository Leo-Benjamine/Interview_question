package Numberprograming;

public class Palindrome {
//What is a Palindrome?
//A palindrome is a number (or word) that reads the same backward as forward.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num = 121, reversed = 0, temp = num;
    while(temp!=0) {
    	reversed =reversed*10+temp%10;
    	temp /= 10;
    }
    System.out.println(num == reversed ? "Palindrome" : "Palindrome");
	}

}
