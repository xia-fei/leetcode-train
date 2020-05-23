package subject1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueIdx = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target) {
                Integer idx = valueIdx.get(target - nums[i]);
                if (idx != null) {
                    return new int[]{idx, i};
                } else {
                    valueIdx.put(nums[i], i);
                }
            }
        }
        return null;
    }


}
