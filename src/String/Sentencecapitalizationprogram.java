package String;

public class Sentencecapitalizationprogram {

	public static void main(String[] args) {
		String input = "sentence capitalization program";
		String[] words= input.split(" ");
		StringBuilder result = new StringBuilder();
		
for(String word:words) {
	if(!word.isEmpty()) {
		result.append(Character.toUpperCase(word.charAt(0))+word.substring(1)).append(" ");
	}
}

System.out.println(result.toString().trim());
	}

}
