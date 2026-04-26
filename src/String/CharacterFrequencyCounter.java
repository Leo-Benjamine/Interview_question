package String;

import java.util.HashMap;
import java.util.Map;
public class CharacterFrequencyCounter {
	public static void main(String[] args) {
	String	input ="aabbcaccb";
	StringBuffer output = new StringBuffer();
	Map<Character, Integer>map =new  HashMap<Character, Integer>();
	for(char c1:input.toCharArray()) {
		map.put(c1, map.getOrDefault(c1, 0)+1);	
	
	for(char key: map.keySet()) {
		output.append(key);
		output.append(map.get(key));
	}
	//System.out.println("Input value ="+input +"/Output value ="+output);	
	}
	System.out.println("Input value ="+input +"Output value ="+output);
}
	
}

/**
 * Program Name: Character Frequency Counter
 *
 * Description:
 * This program counts how many times each character appears 
 * in a given string. It uses a HashMap to store characters 
 * along with their frequencies and then prints the result 
 * in the format: character + count (example: a3b2c1).
 *
 * Example:
 * Input  : "aabbccddab"
 * Output : "a3b3c2d2"
 */
