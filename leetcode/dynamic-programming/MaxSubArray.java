/**
53. Maximum Subarray
Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest sum and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */

public class MaxSubArray{
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int tempMax = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            tempMax = Math.max(nums[i], nums[i] + tempMax);
            max = Math.max(max, tempMax);
        }
        return max;
    }
}