package Arrayconcept;

public class EvenAndOddNumbersinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {10, 2, 3, 5, 6, 8, 9, 4};

int n= a.length;
System.out.println("odd values");
for(int i = 0; i<n; i++) {
	if(a[i]%2 !=0) {
		System.out.println(a[i]+ " ");
	}
}
System.out.println();

System.out.println("Even value");
for(int i =0; i<n; i++) {
	if(a[i]%2 ==0) {
		System.out.println(a[i]+"");
	}
}

System.out.println();
	}

}
