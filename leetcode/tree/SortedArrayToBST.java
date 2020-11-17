/*
108. Convert Sorted Array to Binary Search Tree
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class SortedArrayToBST{
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null){
            return null;
        }
        return arrayToBST(0, nums.length - 1, nums);
    }

    public TreeNode arrayToBST(int left, int right, int[] nums){
        if(left > right){
            return null;
        }
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        root.left = arrayToBST(left, mid -1, nums);
        root.right = arrayToBST(mid + 1, right, nums);
        return root;
    }

}