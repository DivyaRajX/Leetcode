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
     List<List<Integer>> bfs = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return bfs;
        bfs(root);
        return bfs;
    }
    void bfs(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> lst = new ArrayList<>(Collections.nCopies(s, 0)); 
            for(int i=0; i<s; i++){
                TreeNode node = q.poll();
                int idx = flag ? i : s-1-i;
                lst.set(idx, node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null)q.offer(node.right);
            }
            flag = !flag;
            bfs.add(lst);
        }
    }   
}