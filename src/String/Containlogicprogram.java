package String;

public class Containlogicprogram {

    public static void main(String[] args) {

        String s1 = "Sunday is Funday";
        String s2 = "was";

        boolean contains = false;

        for (int i = 0; i <= s1.length() - s2.length(); i++) {
        	int j;
            for ( j = 0; j < s2.length(); j++) {

                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }

            if (j == s2.length()) {
                contains = true;
                break;
            }
        }

        if (contains)
            System.out.println("Yes, contains");
        else
            System.out.println("Does not contain");
    }
}
