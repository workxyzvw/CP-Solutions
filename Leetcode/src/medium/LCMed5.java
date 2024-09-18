// Longest Palindromic Substring

package medium;

public class LCMed5 {
	public static void main(String[] args) {
		System.out.println(longestPalindrome("babad"));
	}
	
	/*
	* string = babad
	* i = 0 = b
	* i = 1 = a
	* j = 0 = b
	* i = 2 = b
	* j = 0 = b
	* i == j true
	* i - j + 1 = longest palindrome
	*
	* */
	
	public static String longestPalindrome(String s) {
		char[] letter = s.toCharArray();
		int pointer = s.length() - 1;
		String result = "";
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < pointer; i++) {
			for (int j = 0; j < i; j++) {
				if ((letter[i] == letter[j]) && ((i - j + 1) > result.length())) {
					int limit = i - j;
					boolean valid;
					
					for (int k = j; k <= limit; k++) {
						if (letter[k] == letter[limit]) {
							limit--;
							valid = true;
						}
						else {
							limit--;
							valid = false;
						}
						
						if (valid) {
							String.valueOf(sb.append(letter[k]));
						}
					}
				}
			}
		}
		return sb.toString().trim();
	}
}
