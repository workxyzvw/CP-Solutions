package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Next Permutation
 */
public class LCMed31 {
	public static void main(String[] args) {
		LCMed31 pa=new LCMed31();
		
		int[] arr= {1, 2, 3};
		int[] tempArr = arr.clone();
		
		List<List<Integer>> permute = pa.permute(arr);
		
		System.out.println("Permuations of array : [10, 20, 10] are:");
		System.out.println("=========================================");
		for(List<Integer> perm:permute)
		{
			System.out.println(perm);
		}
		
		printPermute(permute, tempArr);
		
	}
	public List<List<Integer>> permute(int[] arr) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(arr);
		permuteHelper(list, new ArrayList<>(), arr,new boolean[arr.length]);
		return list;
	}
	
	private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int[] arr, boolean [] used){
		
		// Base case
		if(resultList.size() == arr.length){
			list.add(new ArrayList<>(resultList));
		} else{
			for(int i = 0; i < arr.length; i++){
				if(used[i] || i > 0 && arr[i] == arr[i-1] && !used[i - 1])
				{
					// If element is already used
					continue;
				}
				// choose element
				used[i] = true;
				resultList.add(arr[i]);
				
				// Explore
				permuteHelper(list, resultList, arr, used);
				
				// Unchoose element
				used[i] = false;
				resultList.remove(resultList.size() - 1);
			}
		}
	}
	
	public static void printPermute(List<List<Integer>> permute, int[] arr) {
		// Get the size of the outer list (number of inner lists)
		int outerSize = permute.size();
		
		// Iterate through the outer list
		for (int i = 0; i < 1; i++) {
			// Get the inner list at index i
			List<Integer> innerList = permute.get(i);
			
			// Get the size of the inner list
			int innerSize = innerList.size();
			
			// Iterate through the inner list
			for (int j = 0; j < innerSize; j++) {
				// Get and print the integer at index j in the inner list
				int value = innerList.get(j);
				
				if (arr[0] > value) {
					System.out.println("Result: " + permute.get(i));
					break;
				} else {
					System.out.println("Result: " + permute.get(i));
					break;
				}
			}
			System.out.println(); // Add a line break between inner lists
		}
	}
	
}

