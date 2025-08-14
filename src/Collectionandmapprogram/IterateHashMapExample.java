package Collectionandmapprogram;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Map<Integer, String>map= new HashMap<>();
map.put(3, "Cherry");
map.put(6, "Apple");
map.put(2, "Banana");

System.out.println("Iterate the Hasmap");
for (Map.Entry<Integer, String> EntrySet : map.entrySet()) {
	System.out.println(EntrySet.getKey()+ ":" +EntrySet.getValue());

//	Explanation:
//		map.entrySet() returns a set of key-value pairs.
//		entry.getKey() gets the key.
//		entry.getValue() gets the value.
//		This is a clean and efficient way to access all entries in a HashMap.
}
	}

}
