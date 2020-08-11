public class LowesCommonAncestor{
    public TreeNode lca(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val){
            return root;
        }

        TreeNode leftPath = lca(root.left, p, q);
        TreeNode rightPath = lca(root.right, p, q);


    }
}