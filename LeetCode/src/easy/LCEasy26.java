package easy;

/**
 * Remove Duplicates from Sorted Array
 */
public class LCEasy26 {
	
	public static void main(String[] args) {
		int[] num = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(num));
	}
	public static int removeDuplicates(int[] nums) {
		int j = 1;
		for (int iterate = 1; iterate < nums.length; iterate++) {
			if (nums[iterate] != nums[iterate - 1]) {
				nums[j] = nums[iterate];
				j++;
			}
		}
		return j;
	}
}
