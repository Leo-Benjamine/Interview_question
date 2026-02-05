package String;

public class ExtractDigits {
	
	public static void Usingreplace() {
		String word ="abc123xyz45";
	String sentence	= word.replaceAll("[^0-9]", "");
	System.out.println(sentence);	
	}
	public static void UsingCharacterisDigit() {
		String word1 ="Abc123xyz456tv";
		String result ="";
		for(int i=0; i<word1.length();i++) {
			char c1	=word1.charAt(i);
			if(Character.isDigit(c1)) {
				result = result+c1;
				
			}
		}
		System.out.println(result);	
	}
	public static void usingStringBuider() {
		String word2 ="Abc123xyz4567tv";
		StringBuilder result = new StringBuilder();
		for(int i=0; i<word2.length();i++) {
			char c1=word2.charAt(i);
			if(Character.isDigit(c1)) {
				result.append(c1);
			}
		}
		System.out.println(result);
	}
	
	public static void main (String[]args) {
		Usingreplace();
		UsingCharacterisDigit();
		usingStringBuider();
	}

}
