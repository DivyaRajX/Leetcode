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
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        int c = dfs(root, diameter);
        return diameter[0];
    }

    int dfs(TreeNode root, int[] arr){
        if(root == null) return 0;

        int lh = dfs(root.left, arr);
        int rh = dfs(root.right, arr);

        arr[0] = Math.max(arr[0], lh+rh);
        return 1+Math.max(lh, rh);
    }
}