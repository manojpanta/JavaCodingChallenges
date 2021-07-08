package coding.challenges;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

//    leetcode two sum
//   given an array of numbers and a target  return indices of numbers that add up to the target
    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length ; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i <nums.length ; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && i != map.get(complement)) {
                return new int[]{map.get(complement), i};
            }
        }
        throw new IllegalArgumentException("No two sum found!");
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int target = 5;

        System.out.println(twoSum(nums, target)[0]);
        System.out.println(twoSum(nums, target)[1]);

    }
}
