/*
Minimal Tree: Given a sorted (increasing order) array with uniquw integer elements,
write an algorithm to create binary search tree with minimal height
 */

public class MinimalTree{
    TreeNode createMinimalBST(int[] array){
        return createMinimalBST(array, 0, array.length - 1);
    }
    TreeNode createMinimalBST(int[] arr, int start, int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = createMinimalBST(arr, start, mid - 1);
        node.right = createMinimalBST(arr, mid + 1, end);
        return node;
    }
}