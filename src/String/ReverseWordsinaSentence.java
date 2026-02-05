package String;

public class ReverseWordsinaSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "Java is a best language";
		String[] word= sentence.split(" ");
		
		for(int i =word.length-1; i>=0; i--) {
			System.out.print(word[i]+" ");
		}

	}

}
