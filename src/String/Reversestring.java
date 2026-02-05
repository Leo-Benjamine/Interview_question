package String;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Leo Benjamine";
		String reversed =new StringBuilder(str).reverse().toString();
System.out.println(reversed);

    String st2 = "John";
    StringBuffer buffer  = new StringBuffer();
    buffer.append(st2);
    StringBuffer stb= buffer.reverse();
    System.out.println(stb);
    //using ownlogic
    String st3 ="Book";
   char[] characterArray = st3.toCharArray();
   String reversed1="";
   
   /*for(int i=characterArray.length-1;i>=0;i--) {
	   reversed1=reversed1+characterArray[i];
	   
   }
    
   System.out.println(reversed1);*/
   
   for(char ch1 : characterArray) {
	   reversed1=ch1 +reversed1;
	   
   } 
   System.out.println(reversed1);
//Visualize this programing we can use this link To visualize: https://cscircles.cemc.uwaterloo.ca/j...
   }

}
