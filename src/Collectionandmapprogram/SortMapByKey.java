package Collectionandmapprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer>unsortmap = new HashMap<>();
		unsortmap.put("Banana", 2);
		unsortmap.put("Cherry", 5);
		unsortmap.put("Apple", 4);
		System.out.println("unsort map of key: "+ unsortmap);
		
		Map<String, Integer>sortmap= new TreeMap<>(unsortmap);
		
		System.out.println("sort map of key: "+ sortmap);
		

	}

}
