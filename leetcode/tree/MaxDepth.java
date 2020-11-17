/*
104. Maximum Depth of Binary Tree
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

public class MaxDepth{
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> depths = new LinkedList<>();
        int depth = 0;
        int currentDepth = 0;

        stack.add(root);
        depths.add(1);
        while(!stack.isEmpty()){
            root = stack.pollLast();
            currentDepth = depths.pollLast();
            if(root != null){
                depth = Math.max(depth, currentDepth);
                stack.add(root.left);
                stack.add(root.right);
                depths.add(currentDepth + 1);
                depths.add(currentDepth + 1);
            }
        }
        return depth;
    }
}