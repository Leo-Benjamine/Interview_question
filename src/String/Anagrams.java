package String;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {//Check if two string are anagrams
		// TODO Auto-generated method stub
		String st1 = "Listens".toLowerCase();
		String st2 = "Slience".toLowerCase();
		char[] ch1 = st1.toCharArray();
		char[] ch2 = st2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		
		System.out.println(Arrays.equals(ch1, ch2) ? "Anagrams" : "Is not Anagrams");
		
	
		

	}

}
