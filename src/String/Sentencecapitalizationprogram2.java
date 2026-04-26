
package String;

public class Sentencecapitalizationprogram2 {

	public static void main(String[] args) {
		String input = "sentence capitalization program";
        String[] words = input.split(" ");
        String result = "";

        for (String word : words) {
            result = result 
                   + word.substring(0, 1).toUpperCase()
                   + word.substring(1)
                   + " ";
        }

        System.out.println(result.trim());
	}

}
