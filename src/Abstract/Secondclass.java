package Abstract;

public class Secondclass extends Firstclass {

	@Override
	public void firstname() {
		// TODO Auto-generated method stub
		System.out.println("Leo");
		
	}
	@Override
	public void lastname() {
		// TODO Auto-generated method stub
		System.out.println("Benjamine");
		
	}
	public static void main (String[] args) {
		Secondclass sc = new Secondclass();
		sc.firstname();
		sc.lastname();
		sc.phonenumber();
	}

}
