package Arrayconcept;

public class Findthesmallelement {
	public static void main(String[] args) {
		int[] arr = {4, 3, 9, 1};
		int min= arr[0];
		for(int num : arr) {
			if(num <min)min =num;
		}
		System.out.println("Smalllest: " + min);
	}

}
