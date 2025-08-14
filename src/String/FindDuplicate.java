package String;

import java.util.HashSet;
import java.util.Set;


public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Programing";
	Set<Character> seen	= new HashSet<>();
	Set<Character>	Duplicate = new HashSet<>();
	 char[] ch1 = st.toCharArray();
	 
	 for(char c : ch1 ) {
		 if(!seen.add(c)) {
			 Duplicate.add(c);
		 }
	 }
	 System.out.println("Duplicate of value : " + Duplicate);

	}
//In the provided Java program, HashSet is used for two main reasons: 
//to detect duplicates efficiently and to store only unique characters.


}
