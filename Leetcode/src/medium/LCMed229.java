package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LCMed229 {
	public static void main(String[] args) {
		int [] num = {4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 1, 2, 3};
		majorityElement(num);
		System.out.println("num length: " + num.length);
		System.out.println("requirement: " + num.length / 3);
		
		for (int result: majorityElement(num)) {
			System.out.println(result);
		}
	}
	
	public static List<Integer> majorityElement(int[] nums) {
		Map<Integer, Integer> eCount = new HashMap<>();
		int numLength = nums.length;
		int req = numLength / 3;
		List<Integer> result = new ArrayList<>();
		int eNumber = 0;
		int totaleNumAppear = 0;
		
		for (int element : nums) {
			if (eCount.containsKey(element)) {
				eCount.put(element, eCount.get(element) + 1);
			} else {
				eCount.put(element, 1);
			}
		}

		for (Map.Entry<Integer, Integer> eNum : eCount.entrySet()) {
			eNumber = eNum.getKey();
			totaleNumAppear = eNum.getValue();
			
			if (totaleNumAppear > req) {
				result.add(eNumber);
			}
		}
		
		return result;
	}
}
