package medium;

/**
 * Rotate Image
 */

public class LCMed48 {
	public static void main(String[] args) {
		int[][] image = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		System.out.println("Original Image:");
		printMatrix(image);
		
		rotate(image);
		
		System.out.println("\nRotated Image:");
		printMatrix(image);
	}
	
	public static void rotate(int[][] matrix) {
		int length = matrix.length;
		
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][length - 1 - j];
				matrix[i][length - 1 - j] = temp;
			}
		}
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
