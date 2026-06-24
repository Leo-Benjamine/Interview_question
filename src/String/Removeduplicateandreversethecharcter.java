package String;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicateandreversethecharcter {
	public static void main(String[] args) {
		String st = "Hello World";
		Set<Character> set = new HashSet<>();
		StringBuilder result = new StringBuilder();
		String rev = "";
		char[] ch= st.toCharArray();
		for(char c:ch) {
		if(set.add(c)){
		result.append(c);

		}}
		rev = rev + result;
		//System.out.println(rev);
		String fin = "";
		//System.out.println();
		for(int i=rev.length()-1; i>=0; i--){
		char ch1 =rev.charAt(i);
		fin =fin + ch1;

		}

		System.out.print(fin);
	}

}
