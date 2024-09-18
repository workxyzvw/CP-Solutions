package easy;

/**
 * Score of a String
 */

public class LCEasy3110 {
	public static void main(String[] args) {
		System.out.println(scoreOfString("hello"));
	}
	
	public static int scoreOfString(String s) {
		int result = 0;
		
		for (int i = 0; i < s.length() - 1; i++) {
			result += Math.abs(((int) s.charAt(i)) - ((int) s.charAt(i + 1)));
		}
		
		return result;
	}
}
