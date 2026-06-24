package String;

public class RemovespecailcharacterinLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st ="Hello@%World!";
		String result = "";

		for(int i=0; i<st.length(); i++){
		char c=st.charAt(i);

		if (Character.isLetter(c)){

		result = result + c;
		}
		}
		System.out.print(result+" ");

	}

}
