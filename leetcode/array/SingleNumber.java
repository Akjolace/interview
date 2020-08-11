/*
136. Single Number
        Given a non-empty array of integers, every element appears twice except for one. Find that single one.

        Note:

        Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/

public class SingleNumber{
    public int singleNumber(int[] nums){
        int result = 0;
        for(int i : nums){
            result ^= i;
        }
        return result;
    }
}