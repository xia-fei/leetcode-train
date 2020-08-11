package subject1;

import java.util.Arrays;

public class Solution169 {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int max = nums.length / 2;
        Arrays.sort(nums);
        int value = nums[0];
        int count = 0;

        for (int i : nums) {
            if (i == value) {
                count++;
                if (count > max) {
                    return i;
                }
            } else {
                count = 1;
            }
            value = i;
        }
        throw new RuntimeException("没找到");

    }
}
