package Arrayconcept;

public class Addthecontinousnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 5, 6, 0, 3, 0, 4, 5};
		int sum = 0;
		int big = 0;
		
	for(int i= 0; i<arr.length-1; i++) {
		 sum=arr[i]+arr[i+1];
		 if(big<sum) {
			 big=sum;
		 }
	}
		
System.out.println(big);
	}

}
