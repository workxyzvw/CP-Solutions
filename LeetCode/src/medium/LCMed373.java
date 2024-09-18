package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 373. Find K Pairs with Smallest Sums
 */

public class LCMed373 {
	public static void main(String[] args) {
		int[] nums1 = {1, 7, 11};
		int[] nums2 = {2, 4, 6};
		
		/*int[] nums1 = {1, 1, 2};
		int[] nums2 = {1, 2, 3};*/
		int k = 3;
		
		List<List<Integer>> result = kSmallestPairs(nums1, nums2, k);
		System.out.println("Smallest Pairs: " + result);
	}
	
	public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		List<List<Integer>> result = new ArrayList<>();
		
		// Store pairs, sorted by the sum of the two numbers (pair1[i] + pair2[j])
		// Example: pairPriorityQueue will store pairs like [1, 2], [1, 4] sorted by the sum (1+2=3, 1+4=5)
		PriorityQueue<int[]> pairPriorityQueue = new PriorityQueue<>(
				// Comparator that compares two pairs by their sums (pair1[i] + pair2[j])
				(pair1, pair2) -> Integer.compare(pair1[0] + pair1[1], pair2[0] + pair2[1])
		);
		
		// Initialize the heap with pairs formed by each element in nums1 with the first element of nums2
		// We limit the loop to 'k' to avoid unnecessary pairs if nums1 is larger than needed
		// Example: nums1 = [1, 7, 11], nums2 = [2, 4, 6]
		// The heap initially stores: [1, 2, 0], [7, 2, 0], [11, 2, 0] (each pair has nums1[i] and nums2[0])
		for (int i = 0; i < nums1.length && i < k; i++) {
			pairPriorityQueue.offer(new int[] { nums1[i], nums2[0], 0 });
		}
		
		while (k-- > 0) {
			// Get the current smallest pair from the heap
			// Example: The smallest pair is [1, 2], we add it to the result list
			int[] currentSmallestPair = pairPriorityQueue.poll();
			result.add(Arrays.asList(currentSmallestPair[0], currentSmallestPair[1]));
			
			// Move to the next element in nums2 for the current nums1 element
			// Example: If we processed [1, 2], the next pair would be [1, 4] (nums2[1])
			int indexInArray2 = currentSmallestPair[2];
			
			// If there are more elements in nums2, add the next pair to the heap
			// This keeps exploring the next possible smallest sum combinations
			// Example: After processing [1, 2], we push [1, 4] to the heap
			if (indexInArray2 + 1 < nums2.length) {
				pairPriorityQueue.offer(new int[] { currentSmallestPair[0], nums2[indexInArray2 + 1], indexInArray2 + 1 });
			}
		}
		
		return result;
	}
}
