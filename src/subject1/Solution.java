package subject1;

import java.util.*;

public class Solution {
    /**
     *  只出现一次的数字
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Set<Integer> exists = new HashSet<>();
        for (int n : nums) {
            boolean b = exists.add(n);
            if (!b) {
                exists.remove(n);
            }
        }
        return exists.iterator().next();
    }

    /**
     * 多数元素
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int majority=nums.length/2;
        Arrays.sort(nums);
        int current=nums[0];
        int count=1;
        for (int i = 1; i < nums.length; i++) {
            int num=nums[i];
            if(num==current){
                count++;
                if(count>majority){
                    return num;
                }
            }else{
                count=1;
                current=num;
            }

        }
        return nums[0];
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[0].length;j++) {
                    int n=matrix[i][j];
                    if(n==target){
                        return true;
                    }
                    if(n>target) {
                        break;
                    }

            }

        }
        return false;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }

    public int trap(int[] height) {
        return 0;
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().singleNumber(new int[]{4, 1, 2, 1, 2}));
//        System.out.println(new Solution().majorityElement(new int[]{2,2,1,1,1,2,2}));
//        System.out.println(new Solution().searchMatrix(new int[][]{{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}},20));
//        int [] a=new int[]{1,2,3,0,0,0};
//        new Solution().merge(a,3,new int[]{2,5,6},3);
//        System.out.println(Arrays.toString(a));

        System.out.println(new Solution().trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}