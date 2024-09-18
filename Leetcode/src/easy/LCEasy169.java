package easy;

public class LCEasy169 {
	public static void main(String[] args) {
//		int[] nums = {3, 2, 3};
		int[] nums = {2, 2, 1, 1, 1, 2, 2};
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
		int count = 0;
		int result = 0;
		
		for (int num : nums) {
			result = (count == 0) ? num : result;
			count += (num == result) ? 1 : -1;
		}
		
		if (result > nums.length/2 ) {
			return result;
		}
		
/*		for (int num : nums) {
			if (count == 0) {
				result = num;
			}
			if (num == result) {
				count++;
			} else {
				count--;
			}
		}*/
		
		return result;
	}
}
