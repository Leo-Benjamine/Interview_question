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
		 if(!seen.add(c)) {//seen.add(c) returns false for duplicates.
			               //So !seen.add(c) becomes true only when the character is already seen before.
		Duplicate.add(c);
		 }
	 }
	 System.out.println("Duplicate of value : " + Duplicate);

	}
	
	/*In short:

		 for (char c : ch1) → reads every character
		 seen.add(c) → tries to add new character
		 !seen.add(c) → means the character already exists (duplicate)
		 Duplicate.add(c) → stores duplicate characters*/

	
	/*In the provided Java program, HashSet is used for two main reasons: 
  to detect duplicates efficiently and to store only unique characters.
	
	Purpose of charArray (ch1) here:

		You need to check each character individually in the string.

		Strings in Java don’t directly support iteration with Set in the way you need, so converting it to a char[] makes it easy to loop through each character using for(char c : ch1).

		This way you can check duplicates character by character.

		Without converting to char[], you would have to use something like st.charAt(i) in a loop.
		toCharArray() just makes it simpler and more readable*/


}
