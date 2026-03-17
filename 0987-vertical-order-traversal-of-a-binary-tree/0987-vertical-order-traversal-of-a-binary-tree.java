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
            Pair pr = q.poll();
            TreeNode node = pr.node;
            int row = pr.row;
            int col = pr.col;

            map.putIfAbsent(row, new TreeMap<>());
            map.get(row).putIfAbsent(col, new PriorityQueue<>());
            map.get(row).get(col).add(node.val);

            if(node.left != null) q.offer(new Pair(node.left, row-1, col+1));
            if(node.right != null) q.offer(new Pair(node.right, row+1, col+1));
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> m : map.values()){
            List<Integer> ls = new ArrayList<>();
            for(PriorityQueue<Integer> pq : m.values()){
                while(!pq.isEmpty()){
                    ls.add(pq.poll());
                }
            }ans.add(ls);
        }
        return ans;
    }
}

class Pair{
    TreeNode node;
    int row;
    int col;

    Pair(TreeNode node, int row, int col){
        this.node = node;
        this.row = row;
        this.col = col;
    }
}