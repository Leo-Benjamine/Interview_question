package Arrayconcept;

public class CountValuesDB {
	
	public static void main (String[] args) {
		
		String input[] = {"abc", "111", "abc12", "xyz"};
		int numeric =0;
		int alpha =0;
		int alphanumeric =0;
		for(String s : input) {
			
			
			
			if(s.matches("[0-9]+")) {
				numeric++;
			}
			else if(s.matches("[a-zA-Z]+")){
				alpha++;
			}
			else {
				alphanumeric++;
			}
		}
		System.out.println("Numeric =" +numeric);
		System.out.println("Alpha =" +alpha);
		System.out.println("AlphaNumeric =" +alphanumeric);
	}

}
