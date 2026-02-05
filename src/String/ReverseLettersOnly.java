package String;

public class ReverseLettersOnly {
	public static void main (String[] args) {
		String st ="1ab2";
		char[] arr = st.toCharArray();
		int left = 0;
		int right =arr.length-1;

		while(left<right) {
			if(!Character.isLetter(arr[left])) {
				left++;
				continue;
			}
			if(!Character.isLetter(arr[right])) {
				right--;
				continue;
			}
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		
		System.out.println(arr);
	}

}
