package Arrayconcept;

import java.util.ArrayList;
import java.util.Scanner;

public class Nthterm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		int cons1=3,cons2=7,no1=0,no2=0,temp1=0,temp2=0,index=0;
		
		no1=(temp1*10)+cons1;
		al.add(no1);
		no2=(temp1*10)+cons2;
		al.add(no2);
		
		while(true) {
			for(int i=1;i<=2; i++) {
				if(i==1) {
					temp1=al.get(index++);//3
					no1=(temp1*10)+cons1;
					al.add(no1);
					no2=(temp1*10)+cons2;
					al.add(no2);
				}else {
					temp2=al.get(index++);//7
					no2=(temp2*10)+cons1;
					al.add(no2);
					no2=(temp1*10)+cons2;
					al.add(no2);	
				}
			}
			if(al.size()>100)
				break;
		}
		System.out.println(al);
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Position");
		int position =obj.nextInt()-1;
		if(0<position && position<100) {
			System.out.println("Output = "+al.get(position));	
		}
		else {
			System.out.println("Kindly enter your Position with 100");
		}
			
				

	}

}
