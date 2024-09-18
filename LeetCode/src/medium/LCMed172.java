package medium;

public class LCMed172 {
	
	public static void main(String[] args) {
		System.out.println(trailingZeroes(200));
	}
	
	public static int trailingZeroes(int n) {
		return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
	}
}
