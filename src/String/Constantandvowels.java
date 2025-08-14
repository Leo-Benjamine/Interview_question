package String;

public class Constantandvowels {//Count vowels and consonants in a string

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Hello words";
     int  vowels = 0, consonants =0;
   char[] ch1 = str.toLowerCase().toCharArray();
   for (char c : ch1) {
	   
	   if(Character.isLetter(c));
	   if("aeio".indexOf(c)!= -1)vowels++;
	   else consonants++;
   }
  System.out.println("Vowels: "+ vowels + " Consonants: "+ consonants);
		
	}

}
