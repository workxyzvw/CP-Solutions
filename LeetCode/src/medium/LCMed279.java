package medium;

public class LCMed279 {
	public static void main(String[] args) {
		System.out.println(numSquares(12));
	}
	public static int numSquares(int n) {
		int[] pSquareNum = new int[n + 1];
		
		for (int i = 1; i <= n; i++) {
			pSquareNum[i] = i;
			
			for (int j = 1; j * j <= i; j++) {
				int remainingValue = i - (j * j);
				pSquareNum[i] = Math.min(pSquareNum[i], pSquareNum[remainingValue] + 1);
			}
		}
		return pSquareNum[n];
	}
}
