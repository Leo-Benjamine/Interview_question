package Collectionandmapprogram;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapbykey2 {//sort by dcending order

	public static void main(String[] args) {
		
		Map<Integer, String>map=new HashMap<Integer, String>();
		map.put(1, "Banana");
		map.put(4, "Orange");
		map.put(6, "Cherry");
		map.put(6, "Apple");
		
		Map<Integer, String> tmap	= new TreeMap<Integer, String>(Collections.reverseOrder());
		tmap.putAll(map);
		
		System.out.println(tmap);
		
		
	}
}
