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
    public int maxDepth(TreeNode root) {
        return iterTraversal(root);
    }

    static int iterTraversal(TreeNode root){
        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        int l = 0;
        q.offer(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            for(int i=0; i<levelSize; i++){
                TreeNode curr = q.poll();

                if(curr.left !=  null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            l++;
        }return l;
    }
    static int recursiveTraversal(TreeNode root){
        if(root == null) return 0;

        int l = recursiveTraversal(root.left);
        int r = recursiveTraversal(root.right);

        return Math.max(l,r)+1;
    }
}