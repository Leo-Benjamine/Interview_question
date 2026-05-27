package Numberprograming;

public class ArrangeNumbers {//DB
public static void main (String[] args) {
	
	String st ="a4b3c2";
	
	for(int i=0; i<st.length(); i=i+2) {
		char ch= st.charAt(i);
		int num= Character.getNumericValue(st.charAt(i+1));
		
		for(int j=1; j<=num; j++) {
			System.out.print(ch);
		}
		
	}
	
}
}
