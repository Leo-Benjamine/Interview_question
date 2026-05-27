package Numberprograming;

public class MultiplyNumbers {
	public static void main(String[] args) {//DB

        String str = "abc10x5";

        int product = 1;

        // Replace alphabets with space
        str = str.replaceAll("[a-zA-Z]", " ");

        // Split numbers
        String arr[] = str.trim().split("\\s+");

        for(String s : arr){
            product = product * Integer.parseInt(s);
        }

        System.out.println("Multiplication = " + product);
    }
}
