package String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Leo Benjamine";
	String reversed	= new StringBuilder().reverse().toString();
	System.out.println(str.equals(reversed) ? "Palindrome" : "Is not palindrome");
		

	}

}
