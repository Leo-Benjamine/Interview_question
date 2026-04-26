package String;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st1 = "Programming";
		StringBuilder result= new StringBuilder();
		
		Set<Character> seen = new HashSet<>();
		//seen.add(c) returns false for duplicates.
		char[] ch1= st1.toCharArray();

		for(char c : ch1) {
			if(seen.add(c)) {
			result.append(c);
			
		}
		}		
System.out.println(result);
	}

}
