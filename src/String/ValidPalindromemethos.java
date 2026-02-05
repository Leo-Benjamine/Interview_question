package String;

public class ValidPalindromemethos {
	
	public static void main(String[] args) {
		String st = "A man, a plan, a canal: Panama";
		System.out.println(isplandrome(st));
		
	}
		public static boolean isplandrome(String st) {
		if(st==null)return false;
		
		
		int left =0;
		int right= st.length()-1;
		char[] arr = st.toCharArray();
		while(left<right) {
			while(left<right && !Character.isLetterOrDigit(arr[left])) {
			left++;
			
		}
		while(left<right && !Character.isLetterOrDigit(arr[right])) {
			right--;
		}
		char cl = Character.toLowerCase(arr[left]);
		char cr = Character.toLowerCase(arr[right]);
		if(cl !=cr) {
			return false;
		}
		left++;
		right--;
		}
		
		
		return true;
		
	}

}
