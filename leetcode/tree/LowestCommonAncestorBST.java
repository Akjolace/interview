/*
235. Lowest Common Ancestor of a Binary Search Tree
        Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

        According to the definition of LCA on Wikipedia:
        “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

        Given binary search tree:  root = [6,2,8,0,4,7,9,null,null,3,5]
        */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class LowestCommonAncestorBST{
    public TreeNode lcaBST(TreeNode root, TreeNode p, TreeNode q){
        if(root.val < p.val && root.val < q.val){
            return lcaBST(root.left, p, q);
        } else if(root.val > p.val && root.val > q.val){
            return lcaBST(root.right, p, q);
        } else {
            return root;
        }
    }
}