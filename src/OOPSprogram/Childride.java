package OOPSprogram;

public class Childride extends parentride {//Override
//Methode should be same both parent and class but implementation was different
	@Override
	public void show() {
	System.out.println("The child it's show");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentride over= new Childride();//ParentClass ref = new ChildClass();
		
		over.show();
            
          
            
	}

}

