package Collectionandmapprogram;

import java.util.HashMap;
import java.util.Map;

public class SortMapByvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Map<Integer, String> map= new HashMap<>();
	map.put(10, "Banana");
	map.put(21, "Cherry");
	map.put(25, "Apple");
	 System.out.println("unsortmap: " + map);
	 
	System.out.println("sort the value: ");
	map.entrySet().stream().sorted(Map.Entry.comparingByKey())
	.forEach(System.out::println);
	
	
	}
}

//Explanation:
//map.entrySet() gives you all key-value pairs.
//
//.stream() converts them to a stream for processing.
//
//.sorted(Map.Entry.comparingByValue()) sorts by value in ascending order.
//
//.forEach(System.out::println) prints each entry.
