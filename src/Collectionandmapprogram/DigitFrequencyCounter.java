package Collectionandmapprogram;

import java.util.HashMap;
import java.util.Map;

public class DigitFrequencyCounter {

	public static void main(String[] args) {
		
		String st ="Dinesh2344Hello555";
		
		Map<Character, Integer> map= new HashMap<>();
		
		char[] ch1= st.toCharArray();
		
		for(char c: ch1) {
			if(Character.isDigit(c)) {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		boolean found = false;
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + "=" +entry.getValue());
				found =true;
			}
		}
		if(!found) {
			System.out.println("null");
		}
	}

	
}
