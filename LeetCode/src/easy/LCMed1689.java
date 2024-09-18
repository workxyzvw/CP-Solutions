package easy;

public class LCMed1689 {
	public static void main(String[] args) {
		System.out.println(minPartitions("32"));
	}
	
	public static int minPartitions(String n) {
		int result = 0;
		
		for (int i = 0; i < n.length(); i++) {
			result = Math.max(result, Character.getNumericValue(n.charAt(i)));
		}
		
		return result;
	}
}
