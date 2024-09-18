package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 */

public class LCEasy118 {
	public static void main(String[] args) {
		printPascalTriangle(generate(30));
	}
	
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> triangle = new ArrayList<>();
		List<Integer> triangleRow, previousTriangleRow;
		
		if (numRows == 0) {
			return triangle;
		}
		
		for (int i = 0; i < numRows; i++) {
			triangleRow = new ArrayList<>();
			triangleRow.add(1);
			
			for (int j = 1; j < i; j++) {
				previousTriangleRow = triangle.get(i - 1);
				int value = previousTriangleRow.get(j - 1) + previousTriangleRow.get(j);
				triangleRow.add(value);
			}
			
			if (i > 0) {
				triangleRow.add(1);
			}
			
			triangle.add(triangleRow);
		}
		
		return triangle;
	}
	
	public static void printPascalTriangle(List<List<Integer>> triangle) {
		for (List<Integer> row : triangle) {
			for (int value : row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
