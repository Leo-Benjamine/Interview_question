package Collectionandmapprogram;

import java.util.HashMap;
import java.util.Map;

public class DigitFrequencyCountUsingHashMap {
	
	public static void main(String[] args) {
		String st ="Hello123";
	char[] ch1=	st.toCharArray();
	
	Map<Character, Integer> map = new HashMap<>();
	
	for(char c : ch1) {
		if(Character.isDigit(c)) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
	}
	
	boolean found = false;
	
	for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey() +"="+entry.getValue());
        found =true;
		}
	}
	
	if(!found) {
		System.out.println("null");
	}
		
	}

}
