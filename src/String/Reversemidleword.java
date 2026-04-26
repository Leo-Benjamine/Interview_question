package String;

public class Reversemidleword {
	public static void main(String[] args) {
		String st ="we are india";
		String[] word= st.split(" ");
		
		String words = word[1];
		String result ="";
	for(int i=words.length()-1; i>=0; i--) {
		result =result+words.charAt(i);
	}
	word[1] = result;
	
	String result1 = String.join(" ", word);
	
	System.out.println(result1);
	}

}
