package OOPSprogram;

public class Staticandnonstatic {// Static method and non-static method
	
	public static void staticmethod(){
		System.out.println("Static method");
	}

	public void nonstaticmethod() {
		System.out.println("Non Static method");
		
	}
	public static void main(String[] args) {
		staticmethod();
	    
		Staticandnonstatic st = new Staticandnonstatic();
		st.nonstaticmethod();
		
	}
	
}

//In object-oriented programming, a static method belongs to the class itself,
//while a non-static (instance) method belongs to an object or instance of the class. 
