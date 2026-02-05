package String;

public class Swap {
	
	public void withThirdVariable() {
		int mySalary = 20;
		int superirorSalary = 50;
		
		System.out.println("Before Swapping"+ "First :"+mySalary +"second: "+superirorSalary);
   int temp =mySalary;
   mySalary= superirorSalary;
   superirorSalary=temp;
   
   System.out.println("After Swapping"+ "Mine :"+mySalary +"superiror: "+superirorSalary);
	}
	public void withoutThirdVariable() {
		int first =20; int second=50;
		System.out.println("Before Swapping"+ "First :"+first + "Second: "+second);
		first=first-second;//20-50 =-30
		second=first+second;//-30 +50 =20
		first=second-first;//20-(-30)= 50
		 System.out.println("After Swapping"+ "First :"+first + "Second: "+second);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Swap swap = new Swap();
		swap.withoutThirdVariable();
		}

}
