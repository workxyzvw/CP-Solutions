package easy;

public class LCEasy2769 {
	public static void main(String[] args) {
		System.out.println(theMaximumAchievableX(4, 1));
	}
	
	public static int theMaximumAchievableX(int num, int t) {
		return num + (2 * t);
	}
}
