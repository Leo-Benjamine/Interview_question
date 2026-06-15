package Collectionandmapprogram;

import java.util.HashMap;
import java.util.Map;

public class SecondLargestRepeatedString {

	public static void main(String[] args) {
		String[] arr = {
	            "apple", "banana", "apple", "orange",
	            "banana", "banana", "apple", "orange", "grape"
	        };

	        Map<String, Integer> map = new HashMap<>();

	        // Count frequency of each string
	        for (String str : arr) {
	            map.put(str, map.getOrDefault(str, 0) + 1);
	        }

	        String first = "";
	        String second = "";
	        int firstCount = 0;
	        int secondCount = 0;

	        // Find highest and second highest frequency
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
	            int count = entry.getValue();

	            if (count > firstCount) {
	                secondCount = firstCount;
	                second = first;

	                firstCount = count;
	                first = entry.getKey();
	            } else if (count > secondCount && count < firstCount) {
	                secondCount = count;
	                second = entry.getKey();
	            }
	        }

	        System.out.println("Second largest repeated string: " + second);
	        System.out.println("Frequency: " + secondCount);

	}

}
