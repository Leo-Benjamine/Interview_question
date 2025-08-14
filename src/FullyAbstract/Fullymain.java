package FullyAbstract;

public class Fullymain implements Fullyone {

	@Override
	public void firstnanme() {
		System.out.println("Joy");	
	}
	@Override
	public void lastname() {
		System.out.println("Lee");	
	}
	@Override
	public void phonenumber() {
		System.out.println("9800015980");	
	}
	public static void main (String[] args) {
		Fullymain fm = new Fullymain();
		fm.firstnanme();
		fm.lastname();
		fm.phonenumber();
	}
	

}
