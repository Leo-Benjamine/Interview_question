package String;

public class Sumdigitincharacter {
	
	public static void main(String[] args) {
		
		String st ="acb23d45";
		int sum =0;
		
		for(int i=0; i<st.length(); i++) {
			char ch =st.charAt(i);
			if(Character.isDigit(ch)) {
				sum =sum +Character.getNumericValue(ch);
			}
			
		}
		System.out.println(sum);
	}

}
