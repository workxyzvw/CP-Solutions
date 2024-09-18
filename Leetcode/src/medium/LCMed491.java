package medium;

/**
 * Non-decreasing Subsequences
 */

import java.util.*;

public class LCMed491 {

    public static void main(String[] args) {

        int[] nums = {4, 6, 7, 7}; //[4,4,3,2,1]
        List<List<Integer>> result = findSubsequences(nums);

        for (List<Integer> subsequence : result) {
            System.out.println(subsequence);
        }

    }

    public static List<List<Integer>> findSubsequences(int[] nums) {

        Set<List<Integer>> result = new LinkedHashSet<>();
        List<Integer> current = new ArrayList<>();

        generate(nums, 0, current, result);

        return new ArrayList<>(result);

    }

    public static void generate(int[] nums, int index, List<Integer> currentSubsequence, Set<List<Integer>> result) {

        // Save two elements in array
        if (currentSubsequence.size() >= 2) {
            result.add(new ArrayList<>(currentSubsequence));
        }

        // For non decreasing subsequences
        for (int i = index; i < nums.length; i++) {
            if (currentSubsequence.isEmpty() || nums[i] >= currentSubsequence.get(currentSubsequence.size() - 1)) {
                currentSubsequence.add(nums[i]);
                generate(nums, i + 1, currentSubsequence, result);
                currentSubsequence.remove(currentSubsequence.size() - 1); // remove 1 size after recursive is finish
            }
        }

    }

    /*public static List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            List<Integer> subseq = new ArrayList<>();
            subseq.add(nums[i]);
            queue.offer(subseq);
        }

        while (!queue.isEmpty()) {
            List<Integer> subseq = queue.poll();
            if (subseq.size() >= 2) {
                result.add(new ArrayList<>(subseq));
            }
            int last = subseq.get(subseq.size() - 1);

            for (int i = 0; i < n; i++) {
                if (nums[i] >= last) {
                    List<Integer> newSubseq = new ArrayList<>(subseq);
                    newSubseq.add(nums[i]);
                    queue.offer(newSubseq);
                }
            }
        }
        return result;
    }*/

    /*public static void main(String[] args) {

        int[] nums = {4,6,7,7}; //[4,4,3,2,1]
        List<List<Integer>> result = findSubsequences(nums);

        for (List<Integer> subsequence : result) {
            System.out.println(subsequence);
        }

    }

    public static List<List<Integer>> findSubsequences(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        Set<List<Integer>> duplicate = new HashSet<>();

        generate(nums, 0, current, result, duplicate);

        return result;

    }

    public static void generate(int[] nums, int index, List<Integer> currentSubsequence, List<List<Integer>> result
            , Set<List<Integer>> duplicate) {

        // Save two elements in array
        if (currentSubsequence.size() >= 2) {
            List<Integer> subsequence = new ArrayList<>(currentSubsequence);
            // Non duplicate
            if (!duplicate.contains(subsequence)) {
                duplicate.add(subsequence);
                result.add(subsequence);
            }
        }


        // For non descending part
        for (int i = index; i < nums.length; i++) {
            if (currentSubsequence.isEmpty() || nums[i] >= currentSubsequence.get(currentSubsequence.size() - 1)) {
                currentSubsequence.add(nums[i]);
                generate(nums, i + 1, currentSubsequence, result, duplicate);
                currentSubsequence.remove(currentSubsequence.size() - 1); // remove 1 size after recursive is finish
            }
        }

    }*/
}
