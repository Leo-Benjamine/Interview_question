package String;

public class Reversefirstword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st ="We are india";
		String[] word= st.split(" ");
		
		String words= word[0];
		String reverse ="";
		
		for(int i=words.length()-1; i>=0; i--) {
			reverse =reverse + words.charAt(i);
		}
     word[0] = reverse;
     String result =String.join(" ", word);
     
     System.out.println(result);
	}

}
