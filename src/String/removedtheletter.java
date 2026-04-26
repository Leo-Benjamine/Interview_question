package String;

public class removedtheletter {

	 public static void main(String[] args) {
		 String st = "Leo Benjamine";
		char[] ch1 = st.toCharArray();
		String result ="";
		for(char c1 :ch1) {
			if(c1!='e'||c1!='E') {
			result = result+c1;
				
			}
		}
		System.out.println(result);
	 }
}
