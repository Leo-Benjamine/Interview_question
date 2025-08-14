package OOPSprogram;

public class Overloading {
//	In Java, Method Overloading allows us to define multiple methods with the same name but different parameters within a class. This difference may include:
//		The number of parameters
//		The types of parameters
//		The order of parameters
	
		// TODO Auto-generated method stub
	public void greet() {
		System.out.println("Hello");
		}
	public void greet(String name) {
		System.out.println("Hello " + name);
	}

public static void main(String [] args)	{
	Overloading over = new Overloading();
	over.greet();
	over.greet("John");
	
}

}
