package Javaimportanceprogram;

public class Reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNumber=123;
		int reversedNumber=0;
		
		while(givenNumber!=0) {
			reversedNumber=reversedNumber*10;
			reversedNumber=reversedNumber+givenNumber%10;
			givenNumber=givenNumber/10;
			
		}
		System.out.println(reversedNumber);

	}

}
/*I iterate
reverse =3
givennumber = 12

2 iterat
rever = 32
givennumber =1

3 iterat
revers =32*/