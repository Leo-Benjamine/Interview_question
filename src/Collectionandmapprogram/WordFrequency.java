package Collectionandmapprogram;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
//Count word frequency using HashMap
	
//	HashMap is used to store key-value pairs.
//	Key = word (like "apple")
//	Value = count of how many times that word appears
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"apple", "banana", "apple"};
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println("Word frequencies: " + map);
	}

}
