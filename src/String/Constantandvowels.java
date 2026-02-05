package String;

public class Constantandvowels {//Count vowels and consonants in a string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Hello words";
     int  vowels = 0, consonants =0;
   char[] ch1 = str.toLowerCase().toCharArray();
   for (char c : ch1) {
	   
	   if(Character.isLetter(c));
	   if("aeiou".indexOf(c)!= -1)vowels++;
	   else consonants++;
   }
  System.out.println("Vowels: "+ vowels + " Consonants: "+ consonants);
		
	}
	/*!= -1
			Means character was found
			So c is a vowel
			
			indexOf(c) != -1 checks whether a character is present in a string; if present, 
			it is treated as a vowel.
			*/
}
