package Arrayconcept;

public class EvenOddIndexElements {
	public static void main(String[] args) {
		
 String[] arry = {"Java", "Selenium", "Python", "JavaScript", "Jenkin", "Dockers"};
 
 System.out.println("The Event index are");
 for(int i=0; i<arry.length; i+=2) {
	 System.out.print(arry[i]+" ");
 }
 System.out.println();
 System.out.println();
 System.out.println("The Odd index are");
 for(int j =1; j<arry.length; j+=2) {
	 System.out.print(arry[j]+" ");
 }
	}

}
