package medium;

/**
 * Container With Most Water
 */

public class LCMed11 {
	public static void main(String[] args) {
	
	}
	
	public int maxArea(int[] height) {
		int maxAmount = 0, left = 0, right = height.length - 1;
		
		while (left < right) {
			int h = Math.min(height[left], height[right]);
			int w = right - left;
			int area = h * w;
			
			maxAmount = Math.max(maxAmount, area);
			
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		
		return maxAmount;
	}
}
