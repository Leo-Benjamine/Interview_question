package Collectionandmapprogram;

public class Firstnonrepatingword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word = {"Apple","Banana","Apple","Orange","Cucumber","Orange",};
	for(String words : word) {
		if (map.get(word) == 1) {
		System.out.println("First non-repeating word: " + words);
		break;
		}
		
	}
	}

}
//Explanation:
//✅ for (String word : words)
//This is an enhanced for loop (also called a for-each loop).
//
//It iterates through each word in the array or list named words.
//
//✅ if (map.get(word) == 1)
//map is assumed to be a Map<String, Integer> (like a HashMap) that stores the count of each word.
//
//map.get(word) retrieves the count of how many times that word appears.
//
//This if condition checks if the word occurs exactly once — i.e., it's non-repeating.