package String;

public class Validatepalidrome2 {
	public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s)); // Output: true
    }

    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();

        while (left < right) {

            // Ignore non-alphanumeric characters from left
            while (left < right && !Character.isLetterOrDigit(arr[left])) {
                left++;
            }

            // Ignore non-alphanumeric characters from right
            while (left < right && !Character.isLetterOrDigit(arr[right])) {
                right--;
            }

            // Compare lowercase versions of characters
            if (Character.toLowerCase(arr[left]) != Character.toLowerCase(arr[right])) {
                return false;
            }

            left++;
            right--;
        }
return true;
    }

}
