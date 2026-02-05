package String;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("Append: " + sb);

        sb.insert(5, " Java");
        System.out.println("Insert: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("Replace: " + sb);

        sb.delete(2, 7);
        System.out.println("Delete: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());


	}

}
