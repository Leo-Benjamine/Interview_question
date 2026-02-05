package Javaimportanceprogram;

public class ReplacevowelswithaSpecialCharacter {

	public static void replaceone() {
		String givenText="I miss Mahendra Singh Dohni";
		char[] charArray= givenText.toCharArray();
		
		for(int i=0;i<givenText.length();i++) {
			if(givenText.charAt(i)=='A' ||givenText.charAt(i)=='E'|| givenText.charAt(i)=='I'|| givenText.charAt(i)=='O'||
            givenText.charAt(i)=='U'|| givenText.charAt(i)=='a' ||givenText.charAt(i)=='e'|| givenText.charAt(i)=='i'||
            givenText.charAt(i)=='o'||givenText.charAt(i)=='u')
				charArray[i]='*';
		}
		for(int i=0;i<givenText.length();i++) {
			System.out.print(charArray[i]);
		}
	}
		public static void replacetwo() {
			String givenText="I miss Mahendra Singh Dohni";
		String replaceText= givenText.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.print(replaceText);
		
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceone();
		replacetwo();

	}

}
