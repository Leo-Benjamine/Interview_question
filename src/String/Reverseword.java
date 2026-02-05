package String;

public class Reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st = "Hello Word";
String[] word = st.split(" ");
String reverse = "";

for(String wd : word) {
	StringBuilder stb = new StringBuilder(wd);
	reverse = reverse + stb.reverse().toString() + " ";
	
}
System.out.println(reverse.trim());

	}

}
