package Javaimportanceprogram;

import java.util.Scanner;

public class Trianglepatternsusingscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		//int Numberofline =scanner.nextInt();
		int Numberofline =10;
		int row, column=0;
		
		for(row=0;row<=Numberofline;row++) {
		for(column=0;column<=row;column++) {	
			System.out.print("* ");
		}
		System.out.println();
		}
/*
  outer 1 iterate note the value start=  0
   inner 1 and 2nd iterate //note in inner iteration 2 is exist
   *
  outer 2 iterate 1
  inner 1,2,3rd iterate //note in inner iteration 3 is exist
   * *
  outer 3 iterate 2
  inner 1,2,3,4th iterate //note in inner iteration 4 is exist
   * * *
  outer 4 iterate 3 note end of value =4
  inner 1,2,3,4,5th  iterate //note in inner iteration 5 is exist
  
   * * * *
 
 
 
 
 */
		
	
		
	}

}
