package Javaimportanceprogram;

public class Findtheoccurrenceofacharacter {
	//not clear
	public static void Occurenceiterate() {
		String input= "Leo BenjaminE";
		char toFind='e';
		int occurence=0;
		input=input.toLowerCase();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==toFind) {
				occurence=occurence+1;
			}
		}
		System.out.println(toFind+" is present "+  occurence +" number of times");
	}
	public static void anothermethos() {//need to watch video 10
		String input ="AgniPrasath";
		char toFind='a';
		input=input.toUpperCase();
		String charToFind= Character.toString(toFind).toUpperCase();
		int actualLenght=input.length();
		System.out.println(actualLenght);
		input.replace(charToFind, "");
		
		int lengthAfterReplacing=input.length();
		
		System.out.println(lengthAfterReplacing);
		
		System.out.println(actualLenght-lengthAfterReplacing);
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Findtheoccurrenceofacharacter findtheoccurrenceofacharacter = new Findtheoccurrenceofacharacter();
		//Occurenceiterate();
		anothermethos();
	}

}
