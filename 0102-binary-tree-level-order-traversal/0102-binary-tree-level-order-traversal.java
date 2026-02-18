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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> re = new ArrayList<>();
        helper(root, re, 0);
        return re;
    }

    static void helper(TreeNode root, List<List<Integer>> lvl, int l){
        if(root == null) return;

        if(l >= lvl.size()) lvl.add(new ArrayList<>());

        lvl.get(l).add(root.val);
        helper(root.left, lvl, l+1);
        helper(root.right, lvl, l+1);
    }
}