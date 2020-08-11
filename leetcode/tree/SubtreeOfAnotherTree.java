/*
572. Subtree of Another Tree

        Given two non-empty binary trees s and t, check whether tree t has exactly
        the same structure and node values with a subtree of s.
        A subtree of s is a tree consists of a node in s and
        all of this node's descendants. The tree s could also be considered as a subtree of itself.
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

public class SubtreeOfAnotherTree{
    public boolean isSubtree(TreeNode s, TreeNode t){
        if(s == null){
            return false;
        } else if(isSameTree(s, t)){
            return true;
        } else {
            return isSubtree(s.left, t) || isSubtree(s.right, t);
        }
    }
    public boolean isSameTree(TreeNode s, TreeNode t){
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;

        return (s.val == t.val)
                && isSameTree(s.left, t.left)
                && isSameTree(s.right, t.right);

        // if(s.val == t.val){
        //     return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
        // } else {
        //     return false;
        // }
    }
}

//Time complexity is we assume N = number of nodes in S tree's
// M = number of nodes in T tree => O(N * M)
// Space complexity O(n) depth of the recursio tree