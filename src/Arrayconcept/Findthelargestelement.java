package Arrayconcept;

public class Findthelargestelement {
public static void main(String[] args) {
	int[] arr = {4, 2, 9, 1};
	int max= arr[0];
	for (int num : arr) {
		if(num > max) max = num;
	}
	System.out.println("Largest: " + max);
}
	
}
//Here's a detailed explanation:
//
//package Arrayconcept;: This line declares the package that this Java class belongs to. Packages are used to organize related classes and interfaces.
//
//public class Findthelargestelement {: This line defines a public class named Findthelargestelement. In Java, all executable code resides within classes.
//
//public static void main(String[] args) {: This is the main method, which is the entry point for any Java application.
//
//public: Means it can be accessed from anywhere.
//static: Means it belongs to the class itself, not to any specific object of the class.
//void: Indicates that the method does not return any value.
//String[] args: This is an array of strings that can be used to pass command-line arguments to the program, though they are not used in this particular code.
//int[] arr = {4, 2, 9, 1};:
//
//This line declares an integer array named arr.
//It also initializes the array with four integer values: 4, 2, 9, and 1.
//int max = arr[0];:
//
//A new integer variable named max is declared.
//It is initialized with the value of the first element of the arr array, which is 4. This is a common starting point for finding the maximum, as you need something to compare against.
//for (int num : arr) { ... }:
//
//This is an enhanced for loop (also known as a "for-each" loop). It's a convenient way to iterate over elements of an array or collection.
//For each iteration, the variable num will take on the value of one element from the arr array.
//The loop will execute four times, once for each element (4, 2, 9, 1).
//if (num > max) { max = num; }:
//
//Inside the loop, this if statement performs the core logic of finding the largest element.
//In each iteration, it compares the current element (num) with the current value stored in max.
//If num is greater than max, it means we've found a new largest element, so max is updated to the value of num.
//Let's trace this with the given array {4, 2, 9, 1}:
//
//Initially, max = 4.
//Iteration 1: num = 4. Is 4 > 4? No. max remains 4.
//Iteration 2: num = 2. Is 2 > 4? No. max remains 4.
//Iteration 3: num = 9. Is 9 > 4? Yes. max becomes 9.
//Iteration 4: num = 1. Is 1 > 9? No. max remains 9.
//System.out.println("Largest: " + max);:
//
//After the loop has finished iterating through all elements of the array, the max variable will hold the largest value found.
//This line prints the final result to the console, prepending the string "Largest: " to the value of max.
//In this example, the output will be: Largest: 9
//In essence, this code implements a simple and efficient algorithm to find the maximum value in an array by iterating through it and keeping track of the largest element encountered so far.
//
//
//Sources

