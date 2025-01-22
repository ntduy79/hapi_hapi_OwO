// example we are having an array
// nums = [2,7,1,15], with target number is 9, find the sums in the array for its target number
// solution = [0,1] because nums[0] + nums[1] = 9.

import java.util.HashMap;

public class findTwoSums {
    public static int[] twoSum(int [] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int result = target - nums[i];
            if (map.containsKey(result)) {
                return new int[]{map.get(result), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
