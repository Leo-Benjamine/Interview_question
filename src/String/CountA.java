package String;

public class CountA {

	public static void main(String[] args) {
	
		String st = "Automation and API Testing";
			char[] ch1= st.toCharArray();
			int count = 0;
			for(char c : ch1){
			if(c== 'A' || c=='a'){
				count++;
			}
			}
			System.out.println("Number of A's : "+count);

}

}
