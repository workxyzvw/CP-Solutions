package medium;

/**
 * Reverse Integer
 */

public class LCMed7 {
	
	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
	
	public static int reverse(int x) {
		String str = Integer.toString(x);
		boolean isNegative = false;
		
		if (str.charAt(0) == '-') {
			isNegative = true;
			str = str.substring(1);
		}
		
		StringBuilder reversed = new StringBuilder(str).reverse();
		
		try {
			int reversedInt = Integer.parseInt(reversed.toString());
			
			if (isNegative) {
				return -reversedInt;
			} else {
				return reversedInt;
			}
		} catch (NumberFormatException e) {
			return 0;
		}
	}
}
