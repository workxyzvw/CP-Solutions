import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public static void main(String[] args) {
		System.out.println(fourSum(new int[]{1,0,-1,0,-2,2}, 0));
	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<>();
		int lengthNumber = nums.length;
		int chance = 0;
		List<Integer> memory = new ArrayList<>();
		Arrays.sort(nums);
		
		for (int iterate1 = 0; iterate1 < lengthNumber; iterate1++) {
			if (nums[iterate1] > Math.abs(target)) {
				continue;
			}
			for (int iterate2 = iterate1 + 1; iterate2 < lengthNumber; iterate2++) {
				if (nums[iterate2] + nums[iterate1] > Math.abs(target)) {
					continue;
				}
				for (int iterate3 = iterate2 + 1; iterate3 < lengthNumber; iterate3++) {
					if (nums[iterate3] + nums[iterate2] + nums[iterate1] > Math.abs(target)) {
						continue;
					}
					for (int iterate4 = iterate3  + 1; iterate4 < lengthNumber; iterate4++) {
						int total = nums[iterate1] + nums[iterate2] + nums[iterate3] + nums[iterate4];
						if (total == target) {
							memory.add(nums[iterate1]);
							memory.add(nums[iterate2]);
							memory.add(nums[iterate3]);
							memory.add(nums[iterate4]);
							
							if (!result.contains(memory)) {
								result.add(memory);
							}
							memory = new ArrayList<>();
							break;
						}
					}
				}
			}
			
		}
		
		return result;
	}


//		for (int iterate = 0; iterate < lengthNumber/2; iterate++) {
//			int start = Math.abs(nums[iterate]);
//			int end = Math.abs(nums[lengthNumber - iterate - 1]);
//			if (start == end) {
//				chance +=1;
//			}
//		}
//		System.out.println(chance);
//
//		for (int iterate = 0; iterate < chance; iterate++) {
//			for (int index = 0; iterate < lengthNumber; index++) {
//
//			}
//		}
}
