package Javaimportanceprogram;

public class Extractnumbersfromastring {
	public static void main(String[] args) {//Extract numbers from a string and add them 
		String input ="LeoBenjamine0078";
		int total =0;
		int length=input.length();
		
		for(int i=0; i<length; i++) {
			char character = input.charAt(i);
			if (Character.isDigit(character)) {
				total=total+Character.getNumericValue(character);	
			}
			
		}
System.out.println(total);
	}

}
