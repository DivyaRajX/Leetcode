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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0, 0));
        while(!q.isEmpty()){
            Pair p = q.poll();
            TreeNode temp = p.node;
            int lev = p.level;
            int vert = p.vertical;

            map.putIfAbsent(vert, new TreeMap<>());
            map.get(vert).putIfAbsent(lev, new PriorityQueue<>());
            map.get(vert).get(lev).add(temp.val);

            if(temp.left != null) q.offer(new Pair(temp.left, lev+1, vert-1));
            if(temp.right != null)q.offer(new Pair(temp.right, lev+1, vert+1));
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> tq : map.values()){
            List<Integer> col = new ArrayList<>();
            for(PriorityQueue<Integer> pq : tq.values()){
                while(!pq.isEmpty()){
                    col.add(pq.poll());
                }
            }ans.add(col);
        }
        return ans;
    }

    class Pair{
        TreeNode node;
        int level;
        int vertical;

        public Pair(TreeNode node, int level, int vertical){
            this.node = node;
            this.level = level;
            this.vertical = vertical;
        }
    }
}