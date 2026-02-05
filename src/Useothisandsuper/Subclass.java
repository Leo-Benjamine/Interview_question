package Useothisandsuper;

public class Subclass extends Superclass  {
	int num = 20;
	
	
	public void displayed() {
		System.out.println("this.num : " + this.num);
		System.out.println("super.num : " + super.num);	
		
	}

	/*A subclass is the child class.
	  It inherits (takes) the properties and methods from the superclass using the extends keyword.*/
	

}
