package Javaimportanceprogram;

import java.util.Scanner;

public class HowToFindThePositionOfAnEnglishAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner = new Scanner(System.in);
   System.out.println("Enter your character : ");
   
   char givenChar=scanner.next().charAt(0);
   
   givenChar=Character.toLowerCase(givenChar);
   
   int asciiValue=(int)givenChar;
   System.out.println(asciiValue);
   
   int position= asciiValue-96;
   
   System.out.println(position);
   
   
	}

}
