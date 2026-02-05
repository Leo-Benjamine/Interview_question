package Exception.segment;

public class Runtimeexception {
	
	public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int a = 10 / 0;  // Divide by zero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }/*ArithmeticException is a runtime exception in Java.
        It happens when your program tries to perform an illegal arithmetic operation.*/

        // 2. NullPointerException
        try {
            String str = null;
            System.out.println(str.length()); // Accessing null reference
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
            /*NullPointerException (NPE) is a runtime exception in Java. 
            It happens when your program tries to use an object that is null.*/
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            //You try to access an array index that does NOT exist.
        }

        // 4. NumberFormatException
        try {
            int num = Integer.parseInt("abc"); // Invalid number string
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
           /* You try to convert a String into a number,
             but the String does not contain a valid number.*/
        }
    }

}
