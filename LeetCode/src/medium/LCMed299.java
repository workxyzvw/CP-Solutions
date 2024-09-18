package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 299. Bulls and Cows
 */

public class LCMed299 {
	public static void main(String[] args) {
		System.out.println(getHint("4112", "1114"));
	}
	
	public static String getHint(String secret, String guess) {
		int bulls = 0, cows = 0;
		
		Map<Character, Integer> secretCount = new HashMap<>();
		Map<Character, Integer> guessCount = new HashMap<>();
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < secret.length(); i++) {
			char secretChar = secret.charAt(i);
			char guessChar = guess.charAt(i);
			
			if (secretChar == guessChar) {
				bulls++;
			} else {
				secretCount.put(secretChar, secretCount.getOrDefault(secretChar, 0) + 1);
				guessCount.put(guessChar, guessCount.getOrDefault(guessChar, 0) + 1);
			}
		}
		
		/**
		 * we only need to check the remaining numbers that are not aligned to make it a cow
		 * and numbers that are already aligned (bull digits) and the next number are the same will not be considered
		 */
		for (char key : guessCount.keySet()) {
			if (secretCount.containsKey(key)) {
				cows += Math.min(secretCount.get(key), guessCount.get(key));
				System.out.println("Key: " + key  + " SecretCount: " + secretCount.get(key) + " GuessCount: " + guessCount.get(key));
			}
		}
		
		result.append(bulls).append('A').append(cows).append('B');
		return result.toString();
	}
}
