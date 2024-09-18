package medium;

/**
 * String to Integer (atoi)
 */

public class LCMed8 {
	
	public static void main(String[] args) {
		System.out.println(myAtoi("   -42"));
	}
	
	public static int myAtoi(String s) {
		int sign = 1, i = 0, result = 0, length = s.length();
		
		while (i < length && s.charAt(i) == ' ') {
			i++;
		}
		
		if (i == length) {
			return 0;
		}
		
		if (i < length && (s.charAt(i)) == '+' || s.charAt(i) == '-') {
			sign = (s.charAt(i++) == '-') ? -1 : 1;
		}
		
		while (i < length && Character.isDigit(s.charAt(i))) {
			int digit = s.charAt(i++) - '0';
			
			if ((result > Integer.MAX_VALUE / 10) || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
				return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			
			result = result * 10 + digit;
		}
		
		return result * sign;
	}
}
