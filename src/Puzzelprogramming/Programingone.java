package Puzzelprogramming;

public class Programingone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int choco_in_hand= 15;
int covers_in_hand = choco_in_hand;
int remaining_covers = covers_in_hand%3;
int total_choco =choco_in_hand;

while(covers_in_hand>2) {
	choco_in_hand=covers_in_hand/3;
	covers_in_hand=choco_in_hand+remaining_covers;
	remaining_covers=choco_in_hand%3;
	total_choco =total_choco+choco_in_hand;
	
}
System.out.println(total_choco);
		
		
	}

}
