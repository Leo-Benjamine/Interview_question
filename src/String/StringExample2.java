package String;

public class StringExample2 {
	
	 // 1. Length of string
    public static void lengthExample(String str) {
        System.out.println("Length: " + str.length());
    }

    // 2. Convert to uppercase
    public static void toUpperCaseExample(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
    }

    // 3. Convert to lowercase
    public static void toLowerCaseExample(String str) {
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    // 4. Check if string contains a word
    public static void containsExample(String str, String word) {
        System.out.println("Contains " + word + " : " + str.contains(word));
    }

    // 5. Replace a word/character
    public static void replaceExample(String str, String oldWord, String newWord) {
        System.out.println("After replace: " + str.replace(oldWord, newWord));
    }

    // 6. Get character at index
    public static void charAtExample(String str, int index) {
        System.out.println("Char at index " + index + ": " + str.charAt(index));
    }

    public static void main(String[] args) {
        String text = "Hello Java World";

        lengthExample(text);
        toUpperCaseExample(text);
        toLowerCaseExample(text);
        containsExample(text, "Java");
        replaceExample(text, "Java", "Python");
        charAtExample(text, 6);
    }


}
