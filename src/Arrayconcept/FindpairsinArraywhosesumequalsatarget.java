package Arrayconcept;

public class FindpairsinArraywhosesumequalsatarget {
//Find pairs in Array whose sum equals a target
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry = {2, 3, 4, 5, 7, 8, 9};
		int Target = 7;
		
		for(int i=0; i<arry.length; i++) {
			for(int j=i+1; j<arry.length; j++) {
				if(arry[i]+arry[j]== Target) {
				System.out.println(arry[i]+ "+" +arry[j]+ "=" +Target);	
				}
			}
		}
		

	}

}
