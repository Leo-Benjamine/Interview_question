package String;

public class StringMethodsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a String
        String str = "Java Programming  ";
        String str2 = "java programming";

        // 1️⃣ Length of the string
        System.out.println("1.Length: " + str.length());

        // 2️⃣ Convert to uppercase and lowercase
        System.out.println("2.Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // 3️⃣ Trim spaces
        System.out.println("3.Trimmed: " + str.trim() + " ");

        // 4️⃣ Character at index
        System.out.println("4.Character at index 5: " + str.charAt(5));

        // 5️⃣ Substring examples
        System.out.println("5.Substring from index 2: " + str.substring(2));
        System.out.println("Substring (2, 6): " + str.substring(2, 6));

        // 6️⃣ Replace
        System.out.println("6.Replace 'Java' with 'Python': " + str.replace("Java", "Python"));

        // 7️⃣ Check contents
        System.out.println("7.Contains 'Pro': " + str.contains("Pro"));
        System.out.println("Starts with 'Ja': " + str.trim().startsWith("Ja"));
        System.out.println("Ends with 'ing': " + str.trim().endsWith("ing"));

        // 8️⃣ Equals and equalsIgnoreCase
        System.out.println("8.Equals: " + str.trim().equals(str2));             // case-sensitive
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2));

        // 9️⃣ Index Of and Last Index Of
        System.out.println("9.Index of 'a': " + str.indexOf('a'));
        System.out.println("Last Index of 'a': " + str.lastIndexOf('a'));

        // 🔟 Split example
        String words[] = str.trim().split(" ");
        System.out.println("10.Split words:");
        for (String w : words) {
            System.out.println(w);
        }

        // 11️⃣ Concat
        System.out.println("Concat: " + str.trim().concat(" is fun!"));

        // 12️⃣ isEmpty example
        String emptyStr = "";
        System.out.println("Is empty string: " + emptyStr.isEmpty());


	}

}
