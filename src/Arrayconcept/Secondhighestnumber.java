package Arrayconcept;

public class Secondhighestnumber {
	
	public static void main (String[] args){
		int[] arry = {10, 30, 40, 70, 50, 80};
		int Highest = arry[0];
		int Secondhighest = arry[0];
		
		for(int i =0; i<arry.length; i++) {
			if(arry[i]>Highest) {
				Secondhighest = Highest;
				Highest = arry[i];
			}else if(arry[i]>Secondhighest && (arry[i] != Highest)) {
				Secondhighest =arry[i];
			}
			
			
			
		}
		
		System.out.println(Secondhighest);
		
	}

}
