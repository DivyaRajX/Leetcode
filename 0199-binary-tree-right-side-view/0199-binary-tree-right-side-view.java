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
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode node = p.node;
            int level = p.level;

            if(map.get(level) == null) map.put(level, node.val);
            if(node.right!= null) q.offer(new Pair(node.right, level+1));
            if(node.left != null) q.offer(new Pair(node.left, level+1));
        }

        return new ArrayList<>(map.values());
    }

    // static void helper(TreeNode root, ArrayList<Integer> ans){
    //     if(root == null) return;
    //     ans.add(root.val);
    //     helper(root.right, ans);
    // }

    private class Pair{
        TreeNode node;
        int level;

        Pair(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }
}