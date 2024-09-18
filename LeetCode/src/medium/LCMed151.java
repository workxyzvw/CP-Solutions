package medium;

public class LCMed151 {
	
	public static void main(String[] args) {
		System.out.println(reverseWords("the sky is blue"));
		System.out.println(reverseWords("  hello world  "));
		System.out.println(reverseWords("a good   example"));
	}
	public static String reverseWords(String s) {
		String[] temp = s.split(" ");
		int sLength = temp.length;
		StringBuilder sb = new StringBuilder();
		
		for(int index = sLength - 1; index >= 0; index--) {
			sb.append(temp[index]);
			sb.append(" ");
		}
		
		return sb.toString().trim();
	}
}
