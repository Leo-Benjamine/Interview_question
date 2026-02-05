package String;

public class StringBufferexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        StringBuffer sb = new StringBuffer("Hello");
		   /*  sb.append(" World");
		    sb.insert(5, " Java");
		    sb.replace(0, 5, "Hi");*/
		       sb.delete(2, 6);
		      //  sb.reverse();

		        System.out.println(sb);
		     System.out.println("Length: " + sb.length());
		       System.out.println("Capacity: " + sb.capacity());
		    
		
	}

}
