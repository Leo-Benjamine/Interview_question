package PatternPrograms;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num = 1;
for(int i = 1; i<=5; i++) {
	for(int j= 1; j<=i; j++) {
		System.out.print("* ");
		//System.out.print(num++ +"* ");
	}
	System.out.println();
}
	}

}
/*1st iterate // outer loop
   *          // innerloo  
  2nd iterate
   **
  3rd iterate
  ***
  4 rth iterate
  ****
  5 th iterate
  *****
     
 
 
 
 
 */

