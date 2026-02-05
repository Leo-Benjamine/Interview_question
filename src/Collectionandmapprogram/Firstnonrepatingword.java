package Collectionandmapprogram;

import java.util.LinkedHashMap;
import java.util.Map;

public class Firstnonrepatingword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sentence = "apple banana orange apple banana kiwi mango";
        
        // Split sentence into words
        String[] words = sentence.split(" ");
        
        // LinkedHashMap preserves order
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        
        // Count each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Find the first non-repeating word
        for (String word : words) {
            if (wordCount.get(word) == 1) {
                System.out.println("First Non-Repeating Word: " + word);
                return;
            }
        }
        
        System.out.println("No non-repeating word found.");

}
}