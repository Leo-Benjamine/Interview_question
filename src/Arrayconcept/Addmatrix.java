package Arrayconcept;

public class Addmatrix {
	public static void main(String[] args) {
		
		int[] [] matrix1 = { {1, 2, 3}, 
				             {4, 5, 6} 
		                    };
		
		int[] [] matrix2 = { {7, 8, 9},
				             {1, 2, 3}
		};
		
		
		if (matrix1.length != matrix2.length|| matrix1[0].length != matrix2[0].length) {
			System.out.println("Matrix are not same size cannot add");
			return;
		}
		
		int row = matrix1.length;
		int column =matrix1[0].length;
		
		int[][] sum= new int[row][column];
		
		for(int i =0; i<row; i++){
			for(int j=0; j<column; j++) {
			sum[i][j] = matrix1[i][j]+matrix2[i][j];
				
			}
		}
		System.out.println("sum of matrix");
			for(int i=0;i<row; i++) {
				for(int j=0; j<column; j++) {
					System.out.println(sum[i][j] +"");
				}
			
		System.out.println();
		
		
			
		}
		
		
		
		
		
		
		
		
		
	}

}
