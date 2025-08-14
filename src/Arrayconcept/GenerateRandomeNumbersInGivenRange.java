package Arrayconcept;

import java.util.Random;

public class GenerateRandomeNumbersInGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Randam between 0 to 50 using with randow class");
Random random = new Random();
for(int i= 0; i<5; i++) {
	System.out.println(random.nextInt(50));
}
System.out.println("Randam between 0 to 50 using with math.randow(): ");

for(int i=0; i<5; i++) {
	System.out.println((int) (Math.random()* 50));
	
}
}
}