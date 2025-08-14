package String;

public class RemoveDuplicates {

	public static void main(String[] args) {//Remove duplicate characters
		// TODO Auto-generated method stub
		String st = "Programming";
		StringBuilder  result = new StringBuilder();
		char[] ch1= st.toCharArray();
		for(char c: ch1) {
			if(result.indexOf(String.valueOf(c))== -1) {
				result.append(c);
			}
		}
		System.out.println(result);
	}

}
