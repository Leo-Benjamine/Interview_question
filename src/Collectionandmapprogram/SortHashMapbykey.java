package Collectionandmapprogram;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapbykey {//sort by Ascending order

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String>map=new HashMap<Integer, String>();
		map.put(1, "Banana");
		map.put(4, "Orange");
		map.put(6, "Cherry");
		map.put(5, "Apple");
	Map<Integer, String> tmap	= new TreeMap<Integer, String>(map);
	
	System.out.print("Sort the value to Ascending order"+ tmap);
	
	
	}

}
