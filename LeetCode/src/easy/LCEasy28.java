package easy;

/**
 * Find the Index of the First Occurrence in a String
 */
public class LCEasy28 {
	public static void main(String[] args) {
		System.out.println(strStr("hello", "ll"));
	}
	
	public static int strStr(String haystack, String needle) {
		int index = haystack.indexOf(needle);
		
		return (index != -1) ? index : -1;
	}
}
