package Javaimportanceprogram;

import java.util.stream.IntStream;

public class Howtofindanelementpresentinthearray {//not clear

	int[] array = {1, 2, 3, 4, 5};
	int numberToFind=9;
	boolean found =false;
	
	public void presentOrNot() {
		for(int number:array) {
			if(number==numberToFind) {
				found=true;
				System.out.println("Number Present");
			}
		}
	}
	public void usingInStream() {

boolean found = IntStream.of(array).anyMatch(element->element==numberToFind);
	if(found) {
		System.out.println("Number Persent");
	}else {
		System.out.println("Number is Not Persent");
	}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Howtofindanelementpresentinthearray Howtofindanelementpresentinthearray = new
				Howtofindanelementpresentinthearray();
		Howtofindanelementpresentinthearray.usingInStream();
	}

}
