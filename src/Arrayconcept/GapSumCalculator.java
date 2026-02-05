package Arrayconcept;

public class GapSumCalculator {
//Gap Sum Calculator
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int gap =3;
		int Output_count =3;
		if(gap<arr.length){
			if(Output_count<arr.length) {
				for(int i=0; i<Output_count; i++) {
					int result =0;
					for(int j =i; j<arr.length; j =j+gap) {
						result =result +arr[j];
					}
					System.out.println(result);
				}			
			}else {
				System.out.println("Enter output count value between 0 and array length");
			}	
		}else {
			System.out.println("Enter gap value between array length");
		}
	}
}
