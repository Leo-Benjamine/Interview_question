package String;

public class Extractnonnumericcharacterandreversestring {

    public static void main(String[] args) {

        String st = "leo123";

        String result = "";

        // Extract numeric characters
        for (int i = 0; i < st.length(); i++) {

            char c = st.charAt(i);

            if (Character.isDigit(c)) {
                result = result + c;
            }
        }

        System.out.println("Extracted Numbers: " + result);

        // Reverse the extracted numbers
        String reverse = "";

        for (int i = result.length() - 1; i >= 0; i--) {
            reverse = reverse + result.charAt(i);
        }

        System.out.println("Reversed Numbers: " + reverse);
    }
}