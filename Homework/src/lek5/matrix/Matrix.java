package lek5.matrix;

public class Matrix {
	
	static final int WIDTH = 3;
	static final int LENGTH = 3;
	
	public static void main(String[] args) {
//		byte[][] matrix = {{1, 3, 4,}, {2,-1,7}, {6,1,-1}};
		byte[][] matrix = {{1, 3, 4, 5}, {2,-1,7}, {6,1,-1}};
		
		printNonNegativeRows(matrix);
		
		
	}

	private static void printNonNegativeRows(byte[][] matrix) {
		OUTTER: for (int i = 0; i < matrix.length; i++) {
			int sum = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] < 0) {
					continue OUTTER;
				}
				sum += matrix[i][j];
			}
			System.out.println("Row " + i + " :" +  sum);
		}
		
	}

}
