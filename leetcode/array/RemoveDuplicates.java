/*
80. Remove Duplicates from Sorted Array II
 */

public class RemoveDuplicates{
    //allow max 2 same element
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int index = 0;
        for(int n : nums){
            if(index < 1 || n > nums[index - 1]){
                nums[index++] = n;
            }
        }
        return index;
    }

    //allow max 2 same element
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int index = 0;
        for(int n : nums){
            if(index < 2 || n > nums[index - 2]){
                nums[index++] = n;
            }
        }
        return index;
    }
}