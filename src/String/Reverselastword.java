package String;

public class Reverselastword {
public static void main(String[] args) {
	String st1 ="Welcome into India";
	
	String[] word =st1.split(" ");
	
	String words= word[word.length-1];
	
	String result ="";

	for(int i=words.length()-1; i>=0; i--) {
		result = result + words.charAt(i);
	}
	
	word[word.length-1] = result;
	
	String result1 = String.join(" ", word);
	
	System.out.println(result1);
}



}
