package String;

public class MaximumNumberofCharacters{
//need to watch this video
	//https://www.youtube.com/watch?v=PmRHmx9wVWg&list=PLgWpUXNR_WCfYL2zkWWs8kFsfhhn-9D-E&index=13
	public static String main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		
			
			String input ="abbacdfgcesdfeemn";
			String temp ="";
			int big_length=0;
			for(int i=0;i<input.length();i++) {
				for(int j=i+1;j<input.length();j++) {
					if(input.charAt(i)==input.charAt(j)) {
						if(big_length<input.substring(i+1, j).length()) {
							temp=input.substring(i+1, j);
							big_length=temp.length();
							i=j-1;
							break;
						}
					}
				}
			}
			
			return temp;

		}
	

}
