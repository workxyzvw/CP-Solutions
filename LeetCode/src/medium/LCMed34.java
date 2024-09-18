package medium;

import java.util.Arrays;

/**
 * Find First and Last Position of Element in Sorted Array
 */

public class LCMed34 {
	
	public static void main(String[] args) {
		int[] nums = {};
		System.out.println(Arrays.toString(searchRange(nums, 0)));
	}
	public static int[] searchRange(int[] nums, int target) {
		int[] result = {-1, -1};
		
		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i]) {
				result[0] = i;
				break;
			}
		}
		
		if (result[0] != -1) {
			for (int i = nums.length - 1; i >= 0; i--) {
				if (nums[i] == target) {
					result[1] = i;
					break;
				}
			}
		}
		
		return result;
	}
}
