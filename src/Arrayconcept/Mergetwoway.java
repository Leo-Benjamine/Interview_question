
package Arrayconcept;

import java.util.Arrays;

public class Mergetwoway {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {1, 2};
int[] b = {3, 4, 5};
int[] merged = new int[a.length + b.length];

System.arraycopy(a, 0, merged, 0, a.length);
System.arraycopy(b, 0, merged, a.length, b.length);


System.out.println("Merged array: ");

for (int num : merged) {
    System.out.print(num + " ");
}
	
 //System.out.println(merged);
	}

}
