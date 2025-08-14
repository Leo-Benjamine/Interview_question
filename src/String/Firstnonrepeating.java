package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class Firstnonrepeating {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 String str = "swiss";
	        Map<Character, Integer> count = new LinkedHashMap<>();

	        for (char c : str.toCharArray()) {
	            count.put(c, count.getOrDefault(c, 0) + 1);
	        }

	        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
	            if (entry.getValue() == 1) {
	                System.out.println("First non-repeating: " + entry.getKey());
	                break;
	            }
	        }
	}

}
