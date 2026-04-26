package String;

public class Nonrepeatingwords {
public static void main(String[] args) {
	
	String st ="swiss";
	
	for(int i=0; i<st.length(); i++) {
		char c=st.charAt(i);
		if(st.indexOf(c)==st.lastIndexOf(c)) {
			System.out.println("Non repeatings words are "+c);
			break;
		}
	}
}
}
