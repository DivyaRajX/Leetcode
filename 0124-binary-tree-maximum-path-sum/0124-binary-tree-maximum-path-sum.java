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
    public int maxPathSum(TreeNode root) {
        if(root.left == null && root.right == null) return root.val;
        int[] sum = new int[1];
        sum[0] = Integer.MIN_VALUE;
        mps(root, sum);
        return sum[0];
    }

    int mps(TreeNode root, int[] sum){
        if(root == null) return 0;

        int l = Math.max(0, mps(root.left, sum));
        int r = Math.max(0, mps(root.right, sum));

        sum[0] = Math.max(sum[0], l+r+root.val);
        return root.val+Math.max(l, r);
    }
}