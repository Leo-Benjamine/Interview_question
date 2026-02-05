package Javaimportanceprogram;

public class Findthelengthusingwithoutlenghtmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String givenString="Leo Benjamine";
		char[] charArray = givenString.toCharArray();
		
		int length=0;
		
		for(char c:charArray) {
			length++;
		}
System.out.println(length);
	}

}
