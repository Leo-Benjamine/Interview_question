package Arrayconcept;
//zoho question
public class FindNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {4, 3, 7, 11, 50, 1};
		int X = 4;
		int Y = 10;

		if(X<Y) {
			int i =0;
			while(i<arr.length) {
				if(arr[i]>X &&arr[i]<Y) {
					System.out.println(arr[i]);
				}
				i++;	
			}
				
			
			
		}else {
			System.out.println("Condition is mismatching");
			}

	}

}
