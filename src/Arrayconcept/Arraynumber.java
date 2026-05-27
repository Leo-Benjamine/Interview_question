package Arrayconcept;

public class Arraynumber {
	public static void main (String[]args) {
		int[] arry = {1,2,3,4,5,6,7,8,9,10};
		
		int start = 0;
		int end =arry.length-1;
		
		while(start <= end) {
			System.out.print(arry[start]);
			
			if(start != end) {
				System.out.print("," +arry[end]);
			}
			start++;
			end--;
			if(start <= end) {
				System.out.print(",");
			}
		}
		
	}

}
