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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<Pair> Q = new LinkedList<>();
        Q.offer(new Pair(p, q));
        while(!Q.isEmpty()){
            Pair pr = Q.poll();
            TreeNode f = pr.p;
            TreeNode s = pr.q;
            
            if(f == null && s== null) continue;
            if(f == null || s == null) return false;


            if(f.val != s.val) return false;
            Q.offer(new Pair(f.left, s.left));
            Q.offer(new Pair(f.right, s.right));
            // if(f.left == null && s.right != null || f.left == null && s.right != null) return false; 
        }
        return true;
    }

    class Pair{
        TreeNode p;
        TreeNode q;

        Pair(TreeNode p, TreeNode q){
            this.p = p;
            this.q = q;
        }
    }
}