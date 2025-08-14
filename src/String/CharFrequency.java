package String;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

	public static void main(String[] args) {
		//Count frequency of each character
        String str = "Hello";
        Map<Character, Integer> map =new HashMap<>();
        
     char[] ch1  = str.toCharArray();
     for(char c: ch1) {
    	 map.put(c, map.getOrDefault(c, 0) + 1);
    	 

     }
System.out.println(map);
}
}