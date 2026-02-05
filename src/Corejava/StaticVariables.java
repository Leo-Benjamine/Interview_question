
package Corejava;

public class StaticVariables {
static int accountBalancce=0;
String depositedBy;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariables object1 = new StaticVariables();
		object1.accountBalancce =1000;
		object1.depositedBy="Agni";
		
		StaticVariables object2 = new StaticVariables();
		object2.accountBalancce =3000;
		object2.depositedBy="Riya";
  
		System.out.println("Object1 integer:"+object1.accountBalancce);
		System.out.println("Object1 String:"+object1.depositedBy);
		System.out.println("Object2 integer:"+object2.accountBalancce);
		System.out.println("Object2 String:"+object2.depositedBy);
		
	}

}
