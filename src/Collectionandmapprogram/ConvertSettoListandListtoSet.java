
package Collectionandmapprogram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSettoListandListtoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Set<String>	set = new HashSet<>();
set.add("Apple");
set.add("Cucumber");
set.add("Banana");

System.out.println("set element: "+ set);
//Set to List
  List<String> list= new ArrayList<>(set);
  System.out.println("list of element: " + list);
           Set<String> set1= new HashSet<>(list);
  System.out.println("set of element: " + set1);

	}

}
