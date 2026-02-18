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
        List<List<Integer>> level = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int s = 0;
        q.offer(root);
        if(root == null) return level;
        while(!q.isEmpty()){
            int len = q.size();
            level.add(new ArrayList<>());

            for(int i=0; i<len; i++){
                TreeNode node = q.poll();
                level.get(s).add(node.val);

                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            s++;
        }
        return level;
    }
}