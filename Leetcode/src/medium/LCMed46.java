package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LCMed46 {
	
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(permute(nums));
	}
	
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		
		Arrays.sort(nums);
		exec(nums, nums.length, 0, result);
		return result;
	}
	
	public static void exec(int[] numList, int numLen, int position, List<List<Integer>> result) {
		if (position == numLen) {
			List<Integer> temp = new ArrayList<>();
			for (int num : numList) {
				temp.add(num);
			}
			result.add(temp);
			return;
		}
		
		for (int iterate = position; iterate < numLen; iterate++) {
			swap(numList, iterate, position);
			exec(numList, numLen, position + 1, result);
			swap(numList, iterate, position);
		}
	}
	
	public static void swap(int[] nums, int iterate, int position) {
		int temp = nums[iterate];
		nums[iterate] = nums[position];
		nums[position] = temp;
	}
}
