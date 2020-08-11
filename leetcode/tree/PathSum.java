/*112. Path Sum
        Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

        Note: A leaf is a node with no children.*/

public class PathSum{
    public boolean hasPathSum(TreeNode root, int sum){
        if(root == null) return false; // didn't find the target sum
        if(sum - root.val == 0 && root.left == null && root.right == null) return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
}