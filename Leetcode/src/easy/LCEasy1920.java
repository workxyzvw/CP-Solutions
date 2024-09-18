package easy;

import java.util.Arrays;

public class LCEasy1920 {
	public static void main(String[] args) {
		int[] nums = {0,2,1,5,3,4};
		System.out.println(Arrays.toString(buildArray(nums)));
	}
	
	public static int[] buildArray(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		
		for (int i = 0; i < n; i++) {
			result[i] = nums[nums[i]];
		}
		
		return result;
	}
}
