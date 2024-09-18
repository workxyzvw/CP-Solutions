package easy;

import java.util.Arrays;

public class LCEasy1929 {
	public static void main(String[] args) {
		int[] nums = { 5,8,1,9,9,18,16,1,11,6,8,10 };
		Arrays.toString(getConcatenation(nums));
	}
	
	public static int[] getConcatenation(int[] nums) {
		/*int[] result = new int[nums.length * 2];
		
		for (int i = 0; i < result.length; i++) {
			result[i] = nums[i % nums.length];
		}
		
		return result;*/
		
		int[] result = new int[nums.length * 2];
		int x = 0;
		
		for (int i = 0; i < result.length; i++) {
			if (x == nums.length) {
				x = 0;
			}
			
			result[i] = nums[x];
			x++;
		}
		return result;
	}
}
