package String;

public class RemoveDuplicates {

	public static void main(String[] args) {//Remove duplicate characters
		// TODO Auto-generated method stub
		String st = "Programming";
		StringBuilder  result = new StringBuilder();
		char[] ch1= st.toCharArray();
		for(char c: ch1) {
			if(result.indexOf(String.valueOf(c))== -1) {
				result.append(c);
			}
		}
		System.out.println(result);
	}

}
/*1. for(char c : ch1)

Here, ch1 is a char[] created from the string "Programming" using toCharArray().

The enhanced for-each loop iterates over every character one by one.
Example: P, r, o, g, r, a, m, m, i, n, g

2. if(result.indexOf(String.valueOf(c)) == -1)

String.valueOf(c) converts the current character (like 'P') into a string (like "P").

result.indexOf(...) checks if that character already exists in the StringBuilder result.

If the character is not found, indexOf returns -1.

If it is found, it returns the position where the character already exists.

So this condition means:
👉 "If the character is not yet added into result, then add it."

3. result.append(c);

If the condition is true, the character is appended (added) to the end of result.

This way, only the first occurrence of each character is added.

Duplicates are skipped.

Example Execution ("Programming")

P → not in result → add → result = "P"

r → not in result → add → result = "Pr"

o → not in result → add → result = "Pro"

g → not in result → add → result = "Prog"

r → already in result → skip

a → not in result → add → result = "Proga"

m → not in result → add → result = "Progam"

m → already in result → skip

i → not in result → add → result = "Progami"

n → not in result → add → result = "Progamin"

g → already in result → skip*/