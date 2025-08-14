package Collectionandmapprogram;

import java.util.HashMap;
import java.util.Map;

public class Firstnonrepatingword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word = {"Apple","Banana","Apple","Orange","Cucumber","Orange",};
		             Map<Integer, String> map = new HashMap<>(); 
		             for(String words : word) {
		            	//map.put(words, map.getOrDefault(word, 0) + 1);
		            	 map.put(word, map.getOrDefault(word, 0) + 1);
		             }
                

	}

}
