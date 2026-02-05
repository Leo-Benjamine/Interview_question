package String;

public class MaximumNumberofCharacters2{
//need to watch this video
	//https://www.youtube.com/watch?v=PmRHmx9wVWg&list=PLgWpUXNR_WCfYL2zkWWs8kFsfhhn-9D-E&index=13
	
	public static void main(String[] args) {
        String st = "welcome to java";

        int maxCount = 0;
        char maxChar = ' ';

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            int count = 0;

            for (int j = 0; j < st.length(); j++) {
                if (ch == st.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount && ch != ' ') {
                maxCount = count;
                maxChar = ch;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Count: " + maxCount);
    }

}
