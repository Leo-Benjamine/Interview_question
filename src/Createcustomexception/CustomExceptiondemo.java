package Createcustomexception;

public class CustomExceptiondemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			throw new Exception("This is a custom exception");
		}catch (Myexception e){
			
			System.out.println("Caught: " + e.getMessage());
			
		}
		

	}

}
